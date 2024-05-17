public class PersonClass {
    /**
     * Initiate all the variabels for the person
     */
    private String name;
    private int age;
    private int height;
    private double weight;
    /**
     * Make getters and setters for each variabel (rightclick + source action + getters and setters)
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * A method that sets all a value to all the variables and returns a fully made person
     */
    public static PersonClass createPerson(String name, int age, int height, double weight){
        PersonClass person = new PersonClass();
        person.setName(name);
        person.setAge(age);
        person.setHeight(height);
        person.setWeight(weight);
        return person;
        /**
         * A method to print out the person that we made
         */
    }

    public String toString(){
        return String.format("%s is %d years old, with a height of %d and a total weight of %.2f", this.name, this.age, this.height, this.weight);
    }
}
