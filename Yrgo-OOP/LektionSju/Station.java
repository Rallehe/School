import java.time.LocalTime;
import java.util.Scanner;

public class Station {
    public void nextObservation() {
        Scanner input = new Scanner(System.in);
        Observation newObservation = new Observation();

        for (int i = 0; i < 5; i++) {
            System.out.println("Add temp");
            double obsTemp = input.nextDouble();
            newObservation.setTemp(obsTemp);

            System.out.println("Add winddirection");
            double obsDir = input.nextDouble();
            newObservation.setDegrees(obsDir);

            int min = 0;
            if (newObservation.getMin() != min) {
                newObservation.setId(1);
            }
            LocalTime localTime = LocalTime.now();
            int hour = localTime.getHour();
            newObservation.setHour(hour);
            newObservation.setMin(min);
            min = localTime.getMinute();

            System.out.println("Observations id: " + newObservation.getId());
            System.out.printf("Observationen tagen kl %d:%d temperaturen: %.2f grader Celsius från %s%n",
                    newObservation.getHour(), newObservation.getMin(), newObservation.getTemp(),
                    newObservation.degreesToString());
        }
    }
}
