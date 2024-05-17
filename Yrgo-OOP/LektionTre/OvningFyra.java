import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {
        System.out.println("What's your score on the test?");
        Scanner scanner = new Scanner(System.in);
        int testScore = scanner.nextInt();
        if (testScore >= 44){
            System.out.println("Your grade is MVG, your points: " + testScore);
        }
        else if (testScore >= 35){
            System.out.println("Your grade is VG, your points: " + testScore);
        }
        else if (testScore >= 20){
            System.out.println("Your grade is E, your points: " + testScore);
        }
        else if (testScore < 20){
            System.out.println("You didn't pass the test, your points: " + testScore);
        }
        /*
        if (testScore < 20){
            System.out.println("You didn't pass the test, your points: " + testScore);
        }
        else if (testScore >= 20 && testScore <= 35){
            System.out.println("Your grade is E, your points: " + testScore);
        }
        else if (testScore >= 35 && testScore <= 44){
            System.out.println("Your grade is VG, your points: " + testScore);
        }
        else 
        if (testScore >= 44){
            System.out.println("Your grade is MVG, your points: " + testScore);
            
        }
        */
    }
}
