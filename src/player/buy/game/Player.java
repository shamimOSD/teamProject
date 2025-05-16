package player.buy.game;

import java.util.*;

public class Player {
    int jersyNo;
    String name;
    String country; // "Deshi" or "Foreign"

    Player(int jersyNo, String name, String country) {
        this.jersyNo = jersyNo;
        this.name = name;
        this.country = country;
    }

    void addPlayer(Player player) {
        players.add(player);
    }

    void printTeam() {
        System.out.println(name + ":");
        for (Player p : players) {
            System.out.println("  " + p.country + ": " + p.name);
        }
        System.out.println();
    }

    List<Player> deshiPlayers = new ArrayList<>(Arrays.asList(
            new Player(75, "Shakib Al Hasan", "Bangladesh"),
            new Player(15, "Mushfiqur Rahim", "Bangladesh"),
            new Player(28, "Tamim Iqbal", "Bangladesh"),
            new Player(30, "Mahmudullah", "Bangladesh"),
            new Player(16, "Liton Das", "Bangladesh"),
            new Player(90, "Mustafizur Rahman", "Bangladesh"),
            new Player(3, "Taskin Ahmed", "Bangladesh"),
            new Player(32, "Mehidy Hasan", "Bangladesh"),
            new Player(10, "Nasum Ahmed", "Bangladesh"),
            new Player(66, "Afif Hossain", "Bangladesh"),
            new Player(5, "Mosaddek Hossain", "Bangladesh"),
            new Player(9, "Nurul Hasan", "Bangladesh"),
            new Player(11, "Ebadot Hossain", "Bangladesh"),
            new Player(47, "Shoriful Islam", "Bangladesh"),
            new Player(21, "Najmul Hossain", "Bangladesh")
    ));

    List<Player> foreignPlayers = new ArrayList<>(Arrays.asList(
            new Player(31, "David Warner", "Australia"),
            new Player(63, "Jos Buttler", "England"),
            new Player(55, "Ben Stokes", "England"),
            new Player(22, "Kane Williamson", "New Zealand"),
            new Player(49, "Steve Smith", "Australia"),
            new Player(56, "Babar Azam", "Pakistan"),
            new Player(18, "Virat Kohli", "India"),
            new Player(18, "Faf du Plessis", "South Africa"),
            new Player(12, "Andre Russell", "West Indies"),
            new Player(19, "Rashid Khan", "Afghanistan")
    ));

    // Optionally print remaining players
        System.out.println("Remaining Deshi Players:");
        for (int i = 10; i < deshiPlayers.size(); i++) {
        System.out.println("  " + deshiPlayers.get(i).name);
    }

        System.out.println("\nRemaining Foreign Players:");
        for (int i = 5; i < foreignPlayers.size(); i++) {
        System.out.println("  " + foreignPlayers.get(i).name);
    }


}




