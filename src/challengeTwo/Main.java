package challengeTwo;

public class Main {
    public static void main(String[] args) {
        shouldWakeup(true, 7);
        shouldWakeup(false, 8);
        shouldWakeup(true, 20);
        shouldWakeup(false, 10);
        shouldWakeup(true, 24);
    }

    public static void shouldWakeup(boolean barking, int hourOfDay) {
        if (hourOfDay < 8 || hourOfDay > 22 && barking) {
            System.out.println("wake up!!!");
        } else {
            System.out.println("zzz");
        }
    }
}
