package ClassPractice2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        /*1
Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer
them. If they do have one ask what is balance on the card? If balance of the card is larger than 1000, tell them to pay
 off immediately, otherwise you can tell them that they can spend more.
*/
        //with yes answer more than 1000 dollars
        Scanner input=new Scanner(System.in);
        System.out.println("do you have credit card?");
        String answer= input.nextLine();
        if(answer.equals("yes")){
            System.out.println("what is the balance in the card");}
        if(answer.equals("no")){
            System.out.println("we can offer you one");
        }
        int balance= input.nextInt();
        if(balance>1000){
            System.out.println("pay off immediately");}else{
            System.out.println("you spend more");
        }
        }
    }

