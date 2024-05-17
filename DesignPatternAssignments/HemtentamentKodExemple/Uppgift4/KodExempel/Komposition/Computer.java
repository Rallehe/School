package Komposition;

public class Computer {
    private GPU gpu;
    private CPU cpu;
    public Computer(GPU gpu, CPU cpu) {
        this.gpu = gpu;
        this.cpu = cpu;
    }
    public GPU getGpu() {
        return gpu;
    }
    public CPU getCpu() {
        return cpu;
    }
    public void getSpecs() {
        System.out.println("The computer is running with a " + getGpu() + " as GPU and " + getCpu() + " as processor.");
    }
}
