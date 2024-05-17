public class MathFunctions {
    private double doubleOne;
    private double doubleTwo;
    private int intOne;
    private int intTwo;

    public double getDoubleOne() {
        return doubleOne;
    }
    public void setDoubleOne(double doubleOne) {
        this.doubleOne = doubleOne;
    }
    public double getDoubleTwo() {
        return doubleTwo;
    }
    public void setDoubleTwo(double doubleTwo) {
        this.doubleTwo = doubleTwo;
    }
    public int getIntOne() {
        return intOne;
    }
    public void setIntOne(int intOne) {
        this.intOne = intOne;
    }
    public int getIntTwo() {
        return intTwo;
    }
    public void setIntTwo(int intTwo) {
        this.intTwo = intTwo;
    }
    
    public MathFunctions(int intOne, int intTwo) {
        this.intOne = intOne;
        this.intTwo = intTwo;
    }
    
    public MathFunctions(double doubleOne, double doubleTwo) {
        this.doubleOne = doubleOne;
        this.doubleTwo = doubleTwo;
    }
    public double minDouble() {
        return doubleOne - doubleTwo;
    }
    public double maxDouble() {
        return doubleOne + doubleTwo;
    }
    public double averageDouble() {
        return (doubleOne + doubleTwo) / 2;
    }
    public int minInt() {
        return intOne - intTwo;
    }
    public int maxInt() {
        return intOne + intTwo;
    }
    public int averageInt() {
        return (intOne + intTwo) / 2;
    }
    
}
