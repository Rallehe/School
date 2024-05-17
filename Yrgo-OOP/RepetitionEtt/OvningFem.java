import java.util.Random;

public class OvningFem {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int correctAnswer = 9999;
        int oneTwoThree = 0;
        while (correctAnswer != 123) {
            int newRandom = myRandom.nextInt(1000);
            correctAnswer = newRandom;
            oneTwoThree++;
        }
        System.out.printf("It took %d times to get 123", oneTwoThree);
    }
}