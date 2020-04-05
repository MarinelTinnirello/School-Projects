import java.util.Date;

class Account
{
    private int num;
    private double balance;
    private double annualInterestRate;
    Date dateCreated = new Date();

    public Account()
    {
        Date dateCreated = new Date();
    }

    public Account(int id, double bal, double AIRate)
    {
        num = id;
        balance = bal;
        annualInterestRate = AIRate;
    }

    public Date getDate()
    {
        return dateCreated;
    }

    public int getID()
    {
        return num;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate()
    {
        double monthlyInterestRate = (annualInterestRate / 1200) * balance;

        return monthlyInterestRate;
    }

    public void setDate(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double deposit(double deposit)
    {
        balance += deposit;

        return (deposit);
    }

    public double withdraw(double withdraw)
    {
        this.balance -= withdraw;

        return (withdraw);
    }
}
