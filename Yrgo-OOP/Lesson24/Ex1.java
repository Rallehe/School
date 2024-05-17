public class Ex1 {
    private static class Hello implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
            
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Hello h = new Hello();
        Thread t1 = new Thread(h);
        t1.start();
        Thread t2 = new Thread(h);
        t2.start();

        t1.join();
        System.out.println("Time to quit");
    }
}