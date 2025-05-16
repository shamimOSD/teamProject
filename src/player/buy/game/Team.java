package player.buy.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Team class to hold a list of players
class Team {
    String name;
    List<Player> players;

    Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

// Shuffle lists
        Collections.shuffle(deshiPlayers);
        Collections.shuffle(foreignPlayers);

    // Create teams
    List<Team> teams = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
        teams.add(new Team("Team " + i));
    }

    // Assign players
        for (int i = 0; i < 5; i++) {
        Team team = teams.get(i);

        // 1 foreign player
        team.addPlayer(foreignPlayers.get(i));

        // 2 deshi players
        team.addPlayer(deshiPlayers.get(i * 2));
        team.addPlayer(deshiPlayers.get(i * 2 + 1));
    }

    // Print teams
        for (Team team : teams) {
        team.printTeam();
    }




}
