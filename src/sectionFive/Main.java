package sectionFive;

public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Jerry", highScorePosition);

        highScorePosition = calculateHighScorePosition(3);
        displayHighScorePosition("Ryan", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score " +
                "list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
            return position;
        }
    }

