import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App{
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer("Rasmus PC", 4600, 36000, 2000000);
        computers.add(computer1);
        Computer computer2 = new Computer("Skit dator", 1200, 800, 100000);
        computers.add(computer2);
        Computer computer3 = new Computer("Oskars PC", 3600, 16000, 1500000);
        computers.add(computer3);
        Computer computer4 = new Computer("Skum PC", 2300, 16000, 15000);
        computers.add(computer4);

        Collections.sort(computers);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("------------------------------------------------");

        Comparator<Computer> byHarddrive = Comparator.comparing(Computer::getHarddrive);
        Collections.sort(computers, byHarddrive);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
