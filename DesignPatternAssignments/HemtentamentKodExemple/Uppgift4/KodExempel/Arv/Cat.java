package Arv;

public class Cat extends Animal{
    private boolean isNice;
    public Cat(String name, int age, boolean isNice) {
        super(name, age);
        this.isNice = isNice;
    }
    public String getNice() {
        if (isNice) {
            return "nice";
        }
        return "mean";
    }
    @Override
    public void sound() {
        System.out.println("The " + getNice() + " cat says maow!");
    }
}
