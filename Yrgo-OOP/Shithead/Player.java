import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private List<Card> boardUp;
    private List<Card> boardDown;
    private Player currentPlayer;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Card> getHand() {
        return hand;
    }
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
    public List<Card> getBoardUp() {
        return boardUp;
    }
    public void setBoardUp(List<Card> boardUp) {
        this.boardUp = boardUp;
    }
    public List<Card> getBoardDown() {
        return boardDown;
    }
    public void setBoardDown(List<Card> boardDown) {
        this.boardDown = boardDown;
    }
    @Override
    public String toString() {
        return name;
    }
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
