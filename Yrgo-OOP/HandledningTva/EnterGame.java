import java.util.concurrent.ThreadLocalRandom;

public class EnterGame {
    private int score;
    private int highScore;
    private int totalRounds;
    private int randomSec;
    private long currentTime;
    private long finishTime;
    private int elapsedTime;
    
    public int getHighScore() {
        return highScore;
    }

    public void setHighScore() {
        if (score > highScore) {
            highScore = score;
        }
    }
    
    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime () {
        this.elapsedTime = (int)finishTime / 1000 - (int)currentTime / 1000;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime() {
        this.finishTime = System.currentTimeMillis();
    }

    public long getCurrentTime() {
        return currentTime;
    }
    public void setCurrentTime() {
        this.currentTime = System.currentTimeMillis();
    }
    public int getScore() {
        return score;
    }
    public void setScore() {
        this.score = 20 - Math.abs(elapsedTime - randomSec);
    }
    public int getTotalRounds() {
        return totalRounds;
    }
    public void setTotalRounds() {
        this.totalRounds += 1;
    }
    public int getRandomSec() {
        return randomSec;
    }
    public void setRandomSec() {
        this.randomSec = ThreadLocalRandom.current().nextInt(11) + 10;
    }
}