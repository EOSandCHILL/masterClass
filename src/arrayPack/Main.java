package arrayPack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        // java initializer makes initializing arrays easier here's how:
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

//        int[] newArray;
//        newArray = new int[] {5, 4 , 3, 2, 1};
//        newArray = new int[5];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = newArray.length - i;
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + " ");

            String[] nameArray;
            nameArray = new String[] {"John", "Daron", "Jerry"};
            for (int i = 0; i < nameArray.length; i++) {
                String printedNames = nameArray[i];
                System.out.println("Hello! My name is " + printedNames + "!");
        }

        // 2d Array -> String[row][column] employeeID = new String[Amount of Rows here][Amount of columns here];
        String[][] employeeID = new String[3][3];
        employeeID[0][0] = "01254";
        employeeID[0][1] = "01257";
        employeeID[0][2] = "05257";
        employeeID[1][0] = "01454";
        employeeID[1][1] = "02257";
        employeeID[1][2] = "05277";
        employeeID[2][0] = "08454";
        employeeID[2][1] = "04257";
        employeeID[2][2] = "05777";
        // refactored version of 2D arrays
        String[][] employeeIDRefactored = {
                {"01254", "01257", "05257"},
                {"01454", "02257", "05277"},
                {"08454", "04257", "05777"}
        };
        for (int i = 0; i < employeeIDRefactored.length; i++){
            System.out.println();
            for (int j = 0; j < employeeIDRefactored[i].length; j++) {
                System.out.print(employeeIDRefactored[i][j] + " ");
            }
        }
        }
}
