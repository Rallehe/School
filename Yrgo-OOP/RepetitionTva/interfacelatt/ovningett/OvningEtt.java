package interfacelatt.ovningett;

public class OvningEtt {
    public static int minimum(int[] values){
        int smallestNumber = 0;

        for (int i = 0; i < values.length; i++) {
            if (smallestNumber == 0) {
                smallestNumber = values[i];
            }
            else if (values[i] < smallestNumber) {
                smallestNumber = values[i];
            }
        }
        return smallestNumber;
    }

    public static int maximum(int[] values) {
        int largestNumber = 0;
        for (int i = 0; i < values.length; i++) {
            if (largestNumber == 0) {
                largestNumber = values[i];
            }
            else if (values[i] > largestNumber) {
                largestNumber = values[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 6, 4};
        System.out.println("min: " + minimum(values));
        System.out.println("max: " + maximum(values));
    }
}
