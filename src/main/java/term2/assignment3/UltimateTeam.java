package term2.assignment3;

import java.util.List;

public class UltimateTeam {
    List<UltimatePlayer> players;
    List<Coach>          coaches;

    public UltimateTeam(List<UltimatePlayer> players, List<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters() {
        return getPlayerTypes("cutter");
    }

    public String getHandlers() {
        return getPlayerTypes("handler");
    }

    private String getPlayerTypes(String type) {
        String result = "";
        for (UltimatePlayer player : players) {
            if (type.equals(player.position)) {
                result += player + "\n";
            }
        }
        return result;
    }

    public String toString() {
        String result = "COACHES\n";
        for (Coach coach : coaches) {
            result += coach + "\n";
        }
        result += "\nPLAYERS\n";
        for (UltimatePlayer player : players) {
            result += player + "\n";
        }
        return result;
    }
}
