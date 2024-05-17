import java.net.Socket;

public class MakeCarTest {
    public static void main(String[] args) {
        CarTest car = new CarTest("Audi", 2022, 450);
        System.out.println(car);

        CarTest carOne = new CarTest("Volvo", 1950, 165);
        System.out.println(carOne);
    }

}
