package Komposition;

public class CPU {
    private String type;
    private int cores;

    public CPU(String type, int cores) {
        this.type = type;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return type + " with " + cores + " cores";
    }
}
