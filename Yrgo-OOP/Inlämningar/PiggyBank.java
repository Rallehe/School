public class PiggyBank { // This class stores all the values and helps setting them
    private int value = 0;
    private int numberOfCoins = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value += value;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(int numberOfCoins) {
        this.numberOfCoins += numberOfCoins;
    }
}
