import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OvningSex {
    private long currentTime;
    private long finishTime;
    private int elapsedTime;
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime() {
        this.totalTime += elapsedTime;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime() {
        this.elapsedTime = (int) finishTime / 1000 - (int) currentTime / 1000;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime() {
        this.finishTime = System.currentTimeMillis();
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime() {
        this.currentTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OvningSex timeCheck = new OvningSex();
        System.out.println("What difficulty do you wish to play? (easy/medium/hard) \nAnswer 0 to exit");
        String choise = input.nextLine();

        int correct = 0;
        int totalAnswers = 0;

        int answer = Integer.MAX_VALUE;
        if (choise.equalsIgnoreCase("easy")) {
            do {
                int numberOne = ThreadLocalRandom.current().nextInt(4) + 2;
                int numberTwo = ThreadLocalRandom.current().nextInt(4) + 2;
                timeCheck.setCurrentTime();

                System.out.printf("What is %d x %d?%n", numberOne, numberTwo);
                answer = input.nextInt();

                if (answer == numberOne * numberTwo) {
                    System.out.println("Correct!");
                    correct++;
                }
                timeCheck.setFinishTime();
                timeCheck.setElapsedTime();
                timeCheck.setTotalTime();
                totalAnswers++;
            } while (answer != 0);

        } else if (choise.equalsIgnoreCase("medium")) {
            do {
                int numberOne = ThreadLocalRandom.current().nextInt(9) + 2;
                int numberTwo = ThreadLocalRandom.current().nextInt(9) + 2;
                timeCheck.setCurrentTime();

                System.out.printf("What is %d x %d?%n", numberOne, numberTwo);
                answer = input.nextInt();

                if (answer == numberOne * numberTwo) {
                    System.out.println("Correct!");
                    correct++;
                }
                timeCheck.setFinishTime();
                timeCheck.setElapsedTime();
                timeCheck.setTotalTime();
                totalAnswers++;
            } while (answer != 0);

        } else if (choise.equalsIgnoreCase("hard")) {
            do {
                int numberOne = ThreadLocalRandom.current().nextInt(14) + 2;
                int numberTwo = ThreadLocalRandom.current().nextInt(4) + 2;
                timeCheck.setCurrentTime();

                System.out.printf("What is %d x %d?%n", numberOne, numberTwo);
                answer = input.nextInt();

                if (answer == numberOne * numberTwo) {
                    System.out.println("Correct!");
                    correct++;
                }
                timeCheck.setFinishTime();
                timeCheck.setElapsedTime();
                timeCheck.setTotalTime();
                totalAnswers++;
            } while (answer != 0);
        }
        System.out.printf(
                "You answered %d questions. You were correct on %d. Your total time was %d seconds (average time per question was %d seconds)",
                totalAnswers, correct, timeCheck.getTotalTime(), (timeCheck.getTotalTime() / totalAnswers));
    }
}
