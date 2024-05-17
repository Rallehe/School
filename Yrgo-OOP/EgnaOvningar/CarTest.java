public class CarTest {
    private String model;
    private int year;
    private int horsePower;
    boolean isClassic = false;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        
        if (year <= 1965){
            isClassic = true;
            this.model = " it's a classic! " + model;
        }
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public CarTest(String model, int year, int horsePower){
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
    }
    public String toString (){
        if (isClassic){
            String classic = "it's a classic!";
        }
        return ("Your new car is " + this.model + " made " + this.year + " with " + this.horsePower + " horsepower");
    }
    
}
