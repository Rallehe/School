package litetspel;

import litetspel.Player.Interactive;

public class Rock implements Interactive{

    @Override
    public void interact(Player player) {
        System.out.println("The rock is red and cold");
    }
}
