import java.util.ArrayList;
import java.util.List;

public class ChessCompetitionLogic {
    public static Player winCheck(Player p1, Player p2) {
        while (p1.check() == p2.check()) {
            p1.check();
            p2.check();
        }
        if (p1.check() > p2.check()) {
            return p1;
        } else {
            return p2;
        }
    }


    public static List<Player> chessCompetitionslogic(List<Player> playerList) {
        List<Player> p1 = new ArrayList<>();
        if (playerList.size() == 16) {
            System.out.println("The First round");
        } else if (playerList.size() == 8) {
            System.out.println("The Second round");
        } else if (playerList.size() == 4) {
            System.out.println("The Third round");

        } else if (playerList.size() == 2) {
            System.out.println("The Final round");
        }

        System.out.println("-------------------------------------------------------------------------");


        for (int i = 0; i < playerList.size() / 2; i++) {


            System.out.println("Match Between : " + playerList.get(i).getName() + " and " + playerList.get(playerList.size() - i - 1).getName());

            System.out.println("The winner is " + ChessCompetitionLogic.winCheck(playerList.get(i), playerList.get(playerList.size() - i - 1)).getName());
            p1.add(ChessCompetitionLogic.winCheck(playerList.get(i), playerList.get(playerList.size() - i - 1)));
        }
        if (playerList.size() == 2) {
            System.out.println("Congratulations you are the winner of 2018 competition");
        }
        System.out.println("-------------------------------------------------------------------------");
        return p1;
    }
}
