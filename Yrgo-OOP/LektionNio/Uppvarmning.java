public class Uppvarmning {
    public static void main(String[] args) {
        String[] words = { "Hello", "world", "how", "do", "you", "do?" };
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase();
        }
        for (String word : words) {
            System.out.print(word);
            System.out.print(" ");
        }
    }
}