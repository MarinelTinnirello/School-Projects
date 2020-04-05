/*********************
 Author: Marinel Tinnirello
 Lab 6 - Problem 3
 ********************/

import java.util.Date;
import java.util.Random;

public class Main3
{
    public static void main (String[] args)
    {
        Random rand = new Random();

        @SuppressWarnings("deprecation")
        Date d1 = new Date(2018, 11, 12, 10, 12, 30);
        @SuppressWarnings("deprecation")
        Date d2 = new Date(2018, 11, 12, 12, 40, 30);

        SoccerMatch sm = new SoccerMatch(d1, d2, "Arcadia", "Battle Brawlers", "Avalanche");
        String homePlayerName [] = {"Kat", "Marth", "Robin", "Dilan", "John", "Samantha", "Riku", "Zoey", "Scarlet", "Motoko", "Ed"};
        String visitPlayerName [] = {"Cordelia", "Buff", "Nadia", "Miku", "Malik", "Terra", "Raven", "Grego", "Sagan", "Brock", "Eddy"};

        for(int i = 0; i < 11; i++)
        {
            sm.addHomePlayer(new Player(homePlayerName[i], rand.nextInt(10), "Arthur"));
            sm.addVisitorPlayer(new Player(visitPlayerName[i], rand.nextInt(10), "Phil"));
        }
        for(int i = 0; i < 10; i++)
        {
            sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[i]));
            sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[i]));
        }

        System.out.print("\n\n*************************** Home Team Players *************************** ");
        for(int i = 0; i < 11; i++)
        {
            System.out.println(sm.homePlayers[i]);
        }
        System.out.print("\n\n*************************** Visiting Team Players *************************** ");
        for(int i = 0; i < 11; i++)
        {
            System.out.println(sm.visitorPlayers[i]);
        }
        System.out.print("\n\n*************************** Home Team Goals *************************** ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(sm.homeGoals[i]);
        }
        System.out.print("\n\n*************************** Visiting Team Goals *************************** ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(sm.visitorGoals[i]);
        }

        System.out.print("\n\n*************************** GAME STATUS *************************** ");
        System.out.println(sm.getWinner());
    }
}
