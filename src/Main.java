public class Main {
    public static void main(String[] args) {

    int highScore = caluclateScore(true, 800, 5, 100);
        System.out.println("Twoj wynik " + highScore);
        System.out.println(caluclateScore(true, 10000, 8, 200));

    }



public static int caluclateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

    return  finalScore;
    }
}
