package interfacelatt.ovningtre;

public interface Operator {
    String getName();
    int operation(int[] values);
    int total(int[] values);
    int average(int[] values);
}
