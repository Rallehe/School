public class Card {
    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS;

        public String toString() {
            switch(this) {
                case HEARTS:
                    return "hearts";
                case DIAMONDS:
                    return "diamonds";
                case SPADES:
                    return "spades";
                case CLUBS:
                    return "clubs";
                default:
                    throw new IllegalArgumentException();
            }
        }
        
    }
}
