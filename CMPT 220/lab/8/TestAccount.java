/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 11.3
 ********************/

public class TestAccount
{
    public static void main(String[] args)
    {
        Account acc1 = new Account(100, 10000, 5.0);
        Account acc2 = new SavingsAccount();
        Account acc3 = new CheckingsAccount();

        acc1.deposit(5000);
        acc1.withdraw(4000);

        System.out.println("Account ID:             " + acc1.getID());
        System.out.println("Balance:                 " + acc1.getBalance());
        System.out.println("Monthly Interest Rate:  " + acc1.getMonthlyInterestRate());
        System.out.println("Date created;           " + acc1.getDate());
        System.out.println("toString:       " + acc1.toString());
        System.out.println("toString:       " + acc2.toString());
        System.out.println("toString:       " + acc3.toString());
    }
}

