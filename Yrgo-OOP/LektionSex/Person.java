public class Person {
    private String firstName;
    private String surName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String surName, int age){
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public String toString(){
        return "Our new subject: " + getFirstName() + getSurName() + getAge();
    }
}
