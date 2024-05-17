import java.time.LocalDate;

public class Car {
    /**
     * Everything we must know about the car
     */
    private String regPlate;
    private String model;
    private int yearMade;
    private int weight;
    private int horsePower;

    /**
     * Sets all the values
     */
    public void setRegPlate(String regPlate) {
        if (regPlate.length() <= 6 || regPlate.length() >= 7) {
            this.regPlate = regPlate;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * @return all the values
     */
    public int getWeight() {
        return weight;
    }

    public int getYearMade() {
        return yearMade;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getModel() {
        return model;
    }

    public String getRegPlate() {
        return regPlate;
    }

    /**
     * Checks if the car is older than 25 years
     * 
     * @return true or false
     */
    LocalDate localDate = LocalDate.now();
    int yearDate = localDate.getYear();

    public boolean isClassic() {
        if (yearMade <= yearDate - 25) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * If the car is older than 25 years
     * 
     * @return (it's a classic)
     */
    public String isCarClassic() {
        if (isClassic()) {
            return "(it's a classic)";
        } else {
            return "";
        }
    }

    /**
     * Puts everything together and adds it to the object Car
     * 
     * @param regPlate   Adds the registration plate
     * @param model      Adds the model of the car
     * @param yearMade   Adds what year it was made
     * @param weight     Adds the weight of the car
     * @param horsePower Adds the horsepower of the car
     * @return
     */
    public static Car createCar(String regPlate, String model, int yearMade, int weight, int horsePower) {
        Car car = new Car();
        car.setRegPlate(regPlate);
        car.setModel(model);
        car.setYearMade(yearMade);
        car.setWeight(weight);
        car.setHorsePower(horsePower);
        return car;
    }

    public String toString() {
        return "Your " + this.model + " " + this.regPlate + " is made " + this.yearMade + isCarClassic() + " with "
                + this.horsePower + " horsepower and a total weight of " + this.weight;
    }

    /**
     * Prints out the specifics of the car to the screen.
     */

    public void print() {
        System.out.print("Your " + getModel());
        System.out.print(" " + getRegPlate());
        System.out.print(" is made " + getYearMade());
        if (isClassic()) {
            System.out.print(" " + isCarClassic());
        }
        System.out.print(" with " + getHorsePower());
        System.out.print(" horsepower and a total weight of " + getWeight());
        System.out.println("");

    }
}