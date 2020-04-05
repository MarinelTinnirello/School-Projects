
/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 1
 ********************/

import java.util.Scanner;

public class TestLong
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an long: ");
        long myLong = input.nextLong();

        MyLong myLong1 = new MyLong(myLong);
        MyLong myLong2 = new MyLong(1);
        MyLong myLong3 = new MyLong(2);
        MyLong myLong4 = new MyLong(2);

        System.out.println("The statement Long1 equals Long2 is: " + myLong1.equals(myLong2));
        System.out.println("The statement Long1 equals Long3 is: " + myLong1.equals(myLong3));
        System.out.println("The statement Long1 equals Long4 is: " + myLong1.equals(myLong4));
        System.out.println("The statement Long3 equals Long4 is: " + myLong4.equals(myLong4));

    }
}
