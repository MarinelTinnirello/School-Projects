import java.util.Date;
import java.util.Random;

public class SoccerMatch
{
    Date startTime;
    Date endTime;
    String location;
    String home;
    String visitor;
    Player homePlayers[];
    Player visitorPlayers[];
    Goal homeGoals[];
    Goal visitorGoals[];
    int homePlayerCounter, visitorPlayerCounter;
    int homeGoalCounter, visitorGoalCounter;

    SoccerMatch()
    {
        startTime = endTime = null;
        location = home = visitor = null;

        homePlayers = new Player[11];
        visitorPlayers = new Player[11];
        homeGoals = new Goal[10];
        visitorGoals = new Goal[10];

        homePlayerCounter = visitorPlayerCounter = homeGoalCounter = visitorGoalCounter = 0;

        for (int i = 0; i < 11; i++)
        {
            homePlayers[i] = new Player();
            visitorPlayers[i] = new Player();
        }
        for (int i = 0; i < 10; i++)
        {
            homeGoals[i] = new Goal();
            visitorGoals[i] = new Goal();
        }
    }

    SoccerMatch (Date st, Date en, String loc, String ho, String vi)
    {
        this();

        startTime = st;
        endTime = en;
        location =loc;
        home = ho;
        visitor = vi;
    }

    public void addHomePlayer (Player p)
    {
        homePlayers[homePlayerCounter++] = p;
    }

    public void addVisitorPlayer (Player p)
    {
        visitorPlayers[visitorPlayerCounter++] = p;
    }

    public void addHomeGoal (Goal g)
    {
        homeGoals[homeGoalCounter++] = g;
    }

    public void addVisitorGoal (Goal g)
    {
        visitorGoals[visitorGoalCounter++] = g;
    }

    public int[] getHomeGoals()
    {
        int goals[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            goals[i] = homeGoals[i].getPlayer().getGoals();
        }

        return goals;
    }

    public int[] getVisitorGoals()
    {
        int goals[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            goals[i] = visitorGoals[i].getPlayer().getGoals();
        }

        return goals;
    }

    public String getWinner()
    {
        String winStatus = "";
        int homeGoals[] = getHomeGoals();
        int visitorGoals[] = getVisitorGoals();
        int toHome = 0, toVisitor = 0;

        for (int i = 0; i < 10; i++)
        {
            toHome += homeGoals[i];
            toVisitor += visitorGoals[i];
        }

        winStatus = "\n Home Team Total Goals: " + toHome + "\n Visitor Team Total Goals: " + toVisitor;

        if(toHome > toVisitor)
        {
            winStatus += "\n Winner: Home Team";
        }else if(toVisitor > toHome)
        {
            winStatus += "\n Winner: Visitor Team";
        }else
        {
            winStatus += "\n Tie";
        }

        return winStatus;
    }
}
