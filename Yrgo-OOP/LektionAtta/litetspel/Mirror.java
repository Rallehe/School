package litetspel;

import litetspel.Player.Interactive;

public class Mirror implements Interactive{

    @Override
    public void interact(Player player) {
        System.out.println("You see " + player.getPlayer() + " in the mirror");
    }
}
