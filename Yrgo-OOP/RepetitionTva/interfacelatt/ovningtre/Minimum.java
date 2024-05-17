package interfacelatt.ovningtre;

public class Minimum implements Operator {

    public String getName() {
        return "Smallest number: ";
    }

    public int operation(int[] values) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (minimum > values[i]) {
                minimum = values[i];
            }
        }
        return minimum;
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
