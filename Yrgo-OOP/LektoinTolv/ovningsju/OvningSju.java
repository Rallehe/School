package ovningsju;

public class OvningSju {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            doImportantStuff();
        }
        finally {
            System.out.println(time);
            System.out.println(System.currentTimeMillis());
        }
    }

    public static void doImportantStuff() {
        int roll = 100 / (int) (Math.random() * 3);
        for (int i = 0; i < roll; ++i) {
            System.out.println("Rolling...");
        }
    }
}
