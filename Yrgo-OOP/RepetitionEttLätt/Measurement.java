public class Measurement {
    private int value;
    private int valueTwo;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public Measurement(int value, int valueTwo) {
        this.value = value;
        this.valueTwo = valueTwo;
    }

    public boolean isNegative() {
        if (value < 0 || valueTwo < 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (value < valueTwo) {
            if (isNegative()){
                System.out.print("This measurment is negative ");
            }
            return "" + value;
        } else {
            if (isNegative()){
                System.out.print("This measurment is negative ");
            }
            return "" + valueTwo;
        }
    }
}