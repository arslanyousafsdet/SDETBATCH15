package classPractice9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
     /*   1) Write a program to ask a user to enter item they want to buy and the price of that item. User will
        be entering 5 items. Every time user enters price accumulate the price and tell the user how much
        totalPrice that they should pay.
                If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"*/
        Scanner scan = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter the item and price you want to buy");
            String item = scan.next();
            double price = scan.nextDouble();
            total = price + total;
            System.out.println("this is your total "+total);}
        System.out.println("Please pay for this item");
        double amountPaid=scan.nextDouble();
            if (total > amountPaid) {
                double change=amountPaid-total;
                System.out.println("here is your change  "+change);
            } else if (amountPaid<total) {
                System.out.println("you cannot buy all these things");

            }
        System.out.println("thanks for shopping");
        }

    }


