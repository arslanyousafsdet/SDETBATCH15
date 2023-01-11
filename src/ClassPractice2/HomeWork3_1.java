package ClassPractice2;

import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {
        /*You are a loan specialist and you need to ask user what is the amount of loan is needed. If loan is less or
        equal to 200,000 then you would lend the money otherwise you would reject the client.

        * */
        //with more than 200000
        Scanner input = new Scanner(System.in);
        System.out.println("what is amountof loan is needed");

        int loan = input.nextInt();
        if(loan<=200000){
            System.out.println("i would lend the money");}else{
            System.out.println("i would reject the client");
        }

    }
}
