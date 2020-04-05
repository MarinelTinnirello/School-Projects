public class SavingsAccount extends Account
{
    int overdraft = 0;

    public String toString()
    {
        return "Savings Account:    " + " overdraft limit " + overdraft;
    }
}
