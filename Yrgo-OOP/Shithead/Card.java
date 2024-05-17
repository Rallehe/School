import java.util.List;

public class Card{
    private Suite suite;
    private int number;

    public Card(Card.Suite suite, int number) {
        this.suite = suite;
        this.number = number;
    }

    public enum Suite {
        HEARTS, DIAMONDS, SPADES, CLUBS;

        @Override
        public String toString() {
            switch (this) {
                case HEARTS:
                    return "hearts";
                case DIAMONDS:
                    return "diamonds";
                case SPADES:
                    return "spades";
                case CLUBS:
                    return "clubs";
            }
            throw new IllegalArgumentException();
        }

    }
    private String numberToString(int number) {
        switch (number) {
            case 14:
                return "ace";
            case 11:
                return "jack";
            case 12:
                return "queen";
            case 13:
                return "king";
        }
        return String.valueOf(number);
    }
    @Override
    public String toString() {
        return numberToString(number) + " of " + suite;
    }

    public static List<Card> makeDeck(List<Card> fullDeck) {
        for (Card.Suite suite : Card.Suite.values()) {
            for (int i = 2; i <= 14; i++) {
                Card card = new Card(suite, i);
                fullDeck.add(card);
            }
        }
        return fullDeck;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (number != other.number)
            return false;
        return true;
    }
    public int getNumber() {
        return number;
    }
    
}
