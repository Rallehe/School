import java.util.concurrent.ThreadLocalRandom;

public class OvningTva {
    public static void main(String[] args) {
        int argsInt = 0;
        if (args.length != 0) {
            argsInt = Integer.valueOf(args[0]);
        }
        else {
            argsInt = 1;
        }

        int[] myArray = new int[argsInt];

        for (int i : myArray) {
            int myRandom = ThreadLocalRandom.current().nextInt(100) + 1;
            myArray[i] = myRandom;
            System.out.println(myArray[i]);
        }
    }
}