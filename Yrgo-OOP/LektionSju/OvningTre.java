import java.util.concurrent.ThreadLocalRandom;

public class OvningTre {
    public static void main(String[] args) {

        GameDie rollSixDice = new GameDie(6, 3);

        for (int i = 0; i < rollSixDice.getNumberOfDice(); i++) {
            int randomNumber = (int) ThreadLocalRandom.current().nextDouble(rollSixDice.getDiceSides() + 1);
            rollSixDice.setTotalRoll(randomNumber);
        }
        rollSixDice.setAverage();

        System.out.println(rollSixDice.toString());

        GameDie rollHunderedDice = new GameDie(6, 100);

        for (int i = 0; i < rollHunderedDice.getNumberOfDice(); i++) {
            int randomNumber = (int) ThreadLocalRandom.current().nextDouble(rollHunderedDice.getDiceSides() + 1);
            rollHunderedDice.setTotalRoll(randomNumber);
        }
        rollHunderedDice.setAverage();

        System.out.println(rollHunderedDice.toString());
    }
}