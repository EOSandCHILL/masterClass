package methodOverload;

public class Main {
    public static void main(String[] args) {
       convertToCentimeters(50);
    }

    public static double convertToCentimeters(int height) {
        double converted = height * 2.54;
        System.out.println(converted + " cm");
        return converted;
    }
}
