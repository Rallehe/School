public class OvningTva {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setRegPlate("ABC 123");
        car1.setModel("Audi");
        car1.setWeight(1234);
        car1.setHorsePower(550);
        car1.setYearMade(1995);
        car1.print();

        Car car2 = Car.createCar("CBA 321", "Lexus", 2020, 1200, 650);
        Car car3 = Car.createCar("MAR 426", "Kia", 1996, 42, 72);
        // car2.print();
        System.out.println(car2);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
