public class CheckCores{
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();

        System.out.println(coreCount);
    }
}