package litetspel;

public class Player {
    private String player;

    public Player(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
    
    public interface Interactive {
        void interact (Player player);
    }
}
