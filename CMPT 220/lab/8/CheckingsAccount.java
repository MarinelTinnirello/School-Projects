public class CheckingsAccount extends Account
{
    int overdraft = 500;

    public String toString()
    {
        return "Checking Account:   " + " overdraft limit " + overdraft;
    }
}
