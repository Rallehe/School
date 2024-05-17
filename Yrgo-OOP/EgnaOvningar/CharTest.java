public class CharTest {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);
        a++;
        System.out.println(a);
        a = 4;
        System.out.println(a);
        char b = (char)((char) a / 2);
        System.out.println(b);
        char c =(char)((char) b * 14);
        System.out.println(c);
        int d = c;
        System.out.println(d);
    }
}
