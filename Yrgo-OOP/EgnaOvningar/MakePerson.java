public class MakePerson {
    public static void main(String[] args) {
        PersonClass person = PersonClass.createPerson("Rasmus", 24, 181, 72);
        System.out.println(person);

        PersonClass personTwo = PersonClass.createPerson("Marine", 26, 160, 59);
        System.out.println(personTwo);
    //PersonClass person = new PersonClass(name, age, height, weight)
    }
}
