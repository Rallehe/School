public class PiggyBankTest {
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
