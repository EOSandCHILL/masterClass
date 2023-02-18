package challengeThree;

public class Main {
    public static void main(String[] args) {
        hasTeen(15, 22, 30);
        hasTeen(20, 22, 30);
        hasTeen(5, 22, 3);

    }

    public static void hasTeen(int person1, int person2, int person3) {
        int preTeen = 13;
        int lateTeen = 19;
        boolean teen = true;
        boolean noTeen = false;

        if (person1 >= preTeen && person1 <= lateTeen) {
            System.out.println(teen);
        }
        else if (person2 >= preTeen && person1 <= lateTeen) {
            System.out.println(teen);
        }
        if (person3 >= preTeen && person1 <= lateTeen) {
            System.out.println(teen);
        } else {
            System.out.println(noTeen);
        }
    }
}
