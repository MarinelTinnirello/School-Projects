public class Player
{
    private String name;
    private int goals;
    private String team;

    Player()
    {
        name = team = "";
        goals = 0;
    }

    Player(String name, int goals, String team)
    {
        this.name = name;
        this.goals = goals;
        this.team = team;
    }

    public String getName()
    {
        return name;
    }

    public String getTeam()
    {
        return team;
    }

    public int getGoals()
    {
        return goals;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }

    public void setGoals(int goals)
    {
        this.goals = goals;
    }

    public String toString()
    {
        return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
    }
}
