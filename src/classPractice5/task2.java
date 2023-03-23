package classPractice5;

            import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        /*2) Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a
        weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day” (edited)
                */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the day");
        int day=scan.nextInt();
        if(day>=1&&day<=5){
            System.out.println("its a week day");}
        else if(day>=6&&day<=7){
            System.out.println("it is a weekend");}else{
            System.out.println("invild day");

        }


    }
        }



