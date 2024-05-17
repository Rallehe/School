package Arv;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("Animal sounds");
    }
}
