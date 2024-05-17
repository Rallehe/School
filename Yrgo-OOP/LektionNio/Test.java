public class Test {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String myString = "hej allihopa";
        String[] splitString = myString.split(" ");
        for (String string : splitString) {
            Boolean isNewWord = true;
            for (int i = 0; i < string.length(); i++) {
                char checkLetter = string.charAt(i);

                if (checkLetter == 'b' || checkLetter == 'c' || checkLetter == 'd' || checkLetter == 'f'
                        || checkLetter == 'g' || checkLetter == 'h' || checkLetter == 'j' || checkLetter == 'k'
                        || checkLetter == 'l' || checkLetter == 'm' || checkLetter == 'n' || checkLetter == 'p'
                        || checkLetter == 'q' || checkLetter == 'r' || checkLetter == 's' || checkLetter == 't'
                        || checkLetter == 'v' || checkLetter == 'w' || checkLetter == 'x' || checkLetter == 'z') {
                            sb.append(checkLetter + "all");
                            isNewWord = false;
                }
                else {
                    sb.append(checkLetter);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
