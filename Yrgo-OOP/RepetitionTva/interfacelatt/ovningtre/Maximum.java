package interfacelatt.ovningtre;

public class Maximum implements Operator {

    public String getName() {
        return "Largest number: ";
    }

    public int operation(int[] values) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (maximum < values[i]) {
                maximum = values[i];
            }
        }
        return maximum;
    }

    public int total(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    public int average(int[] values) {
        int average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        average /= values.length;
        return average;
    }

}
