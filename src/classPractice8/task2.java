package classPractice8;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
       /* 2) Create a program that will be asking user to apply for a credit card 10 times. As soon you get
        an “yes” from a user program should stop asking.
        */
        for (int i = 0; i < 10; i++) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you want to Aplly for Credit Card");
        String ans=scan.next();
        if(ans.equalsIgnoreCase("yes")); {
            break;

            }
        //for (int i = 0; i < 10; i++) {

        }

    }
}
