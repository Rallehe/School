public class Robber implements Translator {
    public String getLanguage() {
        return "robber language";
    }

    public String translate(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (CharacterUtils.isConsonant(c)) {
                builder.append(c)
                        .append('o')
                        .append(c);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}