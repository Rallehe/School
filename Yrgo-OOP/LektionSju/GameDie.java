public class GameDie {
    private double diceSides = 6;
    private double numberOfDice;
    public double totalRoll;
    private double average;

    public GameDie(double diceSides, double numberOfDice) {
        this.diceSides = diceSides;
        this.numberOfDice = numberOfDice;
    }

    public double getDiceSides() {
        return diceSides;
    }
    public void setDiceSides(double diceSides) {
        this.diceSides = diceSides;
    }
    public double getAverage() {
        return average;
    }
    public void setAverage() {
        this.average = getTotalRoll() / getNumberOfDice();
    }
    public double getNumberOfDice() {
        return numberOfDice;
    }
    public void setNumberOfDice(double numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public double getTotalRoll() {
        return totalRoll;
    }

    public void setTotalRoll(double totalRoll) {
        this.totalRoll += totalRoll;
    }

    public String toString() {
        return "GameDie [average = " + average + ", diceSides = " + diceSides + ", numberOfDice = " + numberOfDice
                + ", totalRoll = " + totalRoll + "]";
    }
    
}
