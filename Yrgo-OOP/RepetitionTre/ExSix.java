public class ExSix {
    public static void main(String[] args) {

        String subString = args[0];
        String mainString = args[1];

        if (subString == null || mainString == null || subString.length() > mainString.length() || subString.length() == 0) {
            throw new IllegalArgumentException("Add first a substring that is shorter than your mainstring.");
        }
        System.out.println(countSubstrings(subString, mainString));

    }

    public static int countSubstrings(String substring, String text) {
        int count = 0;
        int posistion = 0;
        while (posistion < text.length()) {
            posistion = text.indexOf(substring, posistion);
            if (posistion == -1) {
                break;
            }
            count++;
            posistion++;
        }
        return count;
    }
}
