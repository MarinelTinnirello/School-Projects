public class Goal
{
    private int minute;
    private Player player;

    Goal()
    {
        minute = 0;
        player = null;
    }

    Goal(int min, Player p)
    {
        minute = min;
        player = p;
    }

    public int getMinute()
    {
        return minute;
    }
    public Player getPlayer()
    {
        return player;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public String toString()
    {
        return "\n Minute at which the goal is scored: " + minute + "\n The player scored the goal: " + player.getName();
    }
}