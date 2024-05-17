public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void guessedRight() {
        this.score += 4;
    }

    public void guessedWrong() {
        this.score -= 1;
    }
}
