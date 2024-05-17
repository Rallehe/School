package Komposition;

public class Main {
    public static void main(String[] args) {
        GPU gpu = new GPU("Nvidia", "3070ti");
        CPU cpu = new CPU("AMD", 16);
        Computer computer = new Computer(gpu, cpu);
        computer.getSpecs();
    }
}
