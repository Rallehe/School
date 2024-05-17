package litetspel;

import litetspel.Player.Interactive;

public class Horse implements Interactive{

    @Override
    public void interact(Player player) {
        System.out.println("You're not allowed to ride to horse!");
    }
}
