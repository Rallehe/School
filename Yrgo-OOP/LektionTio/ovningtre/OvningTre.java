package ovningtre;

import java.util.ArrayList;
import java.util.List;

public class OvningTre {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();

        Animals cat = new Chordate("Cat", 12, "ksskss", 0);
        Animals human = new Chordate("Human", 0, "NÄMEN TJEEENARE", 0);
        Animals glasgrodd = new Chordate("Glasgrodd", 4, "boop", 0);
        Animals krill = new Arthropod("Krill", "nauplius", "", 0);
        Animals bee = new Arthropod("Bee", "egg", "bzzzz", 1);

        animals.add(cat);
        animals.add(human);
        animals.add(glasgrodd);
        animals.add(krill);
        animals.add(bee);

        for (Animals animals2 : animals) {
            System.out.println(animals2.toString());
        }
    }
}
