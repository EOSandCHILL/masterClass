package opchallenge;

public class Main {
    public static void main(String[] args) {
        double vone = 20.00;
        double vtwo = 80.00;
        double vthree = (vone + vtwo) * 100.00;
        System.out.println(vthree);
        double vfour = vthree % 40.00;
        System.out.println(vfour);
        boolean isZero = (vfour == 0) ? true : false;
        System.out.println(isZero);
        if (!isZero){
            System.out.println("Got some remainder");
        }
    }
}
