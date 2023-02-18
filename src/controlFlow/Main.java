package controlFlow;

public class Main {
    public static void main(String[] args) {


        for (int countUp = 1; countUp <= 10; countUp++) {
            System.out.println(countUp);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
        for (double newRate = 7.5; newRate <= 10; newRate+= 0.25) {
            double interestAmount = calculateInterest(100.00, newRate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + newRate + "% interest = $" + interestAmount);
        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
