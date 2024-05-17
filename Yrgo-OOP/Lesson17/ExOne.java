import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class ExOne {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Set<String> listOfPeople = new HashSet<>();
            while (true) {
                System.out.println("Add people for the lottery (Enter to exit)");
                String addPeople = input.nextLine();
                listOfPeople.add(addPeople);
                
                if (addPeople.trim().isEmpty()) {
                    break;
                }
            }

            System.out.println("The winner is: " + randomWinner(listOfPeople));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String randomWinner(Set<String> listOfPeople) {
        int myRandom = ThreadLocalRandom.current().current().nextInt(listOfPeople.size());
        Iterator<String> it = listOfPeople.iterator();

        for (int i = 0; i < myRandom; i++) {
            it.next();
        }
        String winner = it.next();
        return winner;
    }
}