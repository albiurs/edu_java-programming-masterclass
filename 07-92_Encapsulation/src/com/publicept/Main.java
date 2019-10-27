package com.publicept;

public class Main {

    public static void main(String[] args) {
        /**
         * Bad example - never ever do this!!!
         */
//        Player player = new Player();
//        player.name = "Urs";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.getHealth());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.getHealth());

        /**
         * Creating EnhancedPlayer by calling the constructor
         */
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Urs", 50, "Sword");
        System.out.println("Initial health is: " + enhancedPlayer.getHealth());
    }
}
