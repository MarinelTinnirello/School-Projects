/*********************
 Author: Marinel Tinnirello
 Lab 6 - Problem 2
 ********************/

import java.util.Scanner;

public class Main2
{
    public static void main (String[] args)
    {
        double coupon;
        int payments;
        double interest;
        double valueMaturity;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coupon payment: $");
        coupon = input.nextDouble();
        System.out.print("Enter number of payments: ");
        payments = input.nextInt();
        System.out.print("Enter the interest rate : %");
        interest = input.nextDouble();
        System.out.print("Enter value of maturity :");
        valueMaturity = input.nextDouble();

        Bond b = new Bond(coupon, payments, interest, valueMaturity);
        System.out.printf("Price of the Bond $:    %.2f\n",b.getPrice());
    }
}
