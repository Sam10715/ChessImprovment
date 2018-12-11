import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {


        Pro pro1 = new Pro("Samer");
        Pro pro2  = new Pro("Ahmad");
        Pro pro3 = new Pro("Motaz");
        Pro pro4 = new Pro("Moustafa");
        Pro pro5 = new Pro("Shadi");
        Pro pro6 = new Pro("Naser");
        Pro pro7 = new Pro("Jan");
        Pro pro8 = new Pro("Duaa");
        Amu amu1 = new Amu("Maher");
        Amu amu2 = new Amu("Reem");
        Amu amu3 = new Amu("Ayhem");
        Amu amu4 = new Amu("Saleh");
        Amu amu5 = new Amu("Basem");
        Amu amu6 = new Amu("Maggie");
        Amu amu7 = new Amu("Wim");
        Amu amu8 = new Amu("Dima");





        List<Player> playersList = new ArrayList<>();

        playersList.add(pro1);
        playersList.add(pro2);
        playersList.add(pro3);
        playersList.add(pro4);
        playersList.add(pro5);
        playersList.add(pro6);
        playersList.add(pro7);
        playersList.add(pro8);
        playersList.add(amu1);
        playersList.add(amu2);
        playersList.add(amu3);
        playersList.add(amu4);
        playersList.add(amu5);
        playersList.add(amu6);
        playersList.add(amu7);
        playersList.add(amu8);




        ChessCompetitionLogic.chessCompetitionslogic(ChessCompetitionLogic.chessCompetitionslogic(ChessCompetitionLogic.chessCompetitionslogic(ChessCompetitionLogic.chessCompetitionslogic(playersList))));




    }



}


