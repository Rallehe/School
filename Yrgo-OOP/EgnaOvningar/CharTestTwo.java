public class CharTestTwo {
    public static void main(String[] args) {
        char a = 'a';
        int b = 1;
        for (int i = 0; i < 200; i++) {
            System.out.println(b + ". " + a);
            a++;
            b++;
        }
    }
}
