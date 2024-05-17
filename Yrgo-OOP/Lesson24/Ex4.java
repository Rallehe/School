public class Ex4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(Ex4::run);
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(500);
    }
    public static void run() {
        while(!Thread.currentThread().isInterrupted()) {
            System.out.println("Hello World");
        }
    }
}
