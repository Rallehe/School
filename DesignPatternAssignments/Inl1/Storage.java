import java.io.*;
import java.util.*;

public class Storage {
    private final static String FILE = "persons.bin";
    @SuppressWarnings("unchecked")
    public static List<Person> fetchPersons(List<Person> list) {
        File f = new File(FILE);
        try {
            if (!f.exists()) {
                System.out.println("INFO: Can't find " + FILE);
                return list;
            }
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream
                            (FILE));
            list = (List<Person>) in.readObject();
            in.close();
            list = new LinkedList<>(list);
        } catch (Exception e) {
            System.err.println("Could not load address book from " + FILE);
        }
        return list;
    }

    public static void save(List<Person> list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE));
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
