public class Main {
    public static void main(String[] args) {
    caluclateScore(true, 800, 5, 500);

    }



public static void caluclateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wyniki " + finalScore);
        }
    }
}
