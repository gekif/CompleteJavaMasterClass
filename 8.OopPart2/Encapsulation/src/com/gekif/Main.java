package com.gekif;

public class Main {

    public static void main(String[] args) {
/*

        Player player = new Player();
        player.name = "Fikar";
//        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healtRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healtRemaining());
*/

        EnchancedPlayer player = new EnchancedPlayer("Fikar", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
