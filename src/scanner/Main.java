package scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        try { // statements that might get errors
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) { // code to handle the exception
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    // The scanner class is a simple text scanner that can parse primitive types and strings.
    // to use the scanner class we must create and instance of Scanner.

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's you're name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");


        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);

        // String name = System.console().readLine("Hi, What's you're name? ");
        System.out.println("Hi, What's you're name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born? ");
        // String dateOfBirth = System.console().readLine("What year were you born? ");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth from "
                    + (currentYear - 125) + " to " + (currentYear));
        try {
            age = checkData(currentYear, scanner.nextLine());
            validDOB = age < 0 ? false : true;
        } catch (NumberFormatException badUserData) {
            System.out.println("Characters not allowed!!! Try again!!!");
        }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }
    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
