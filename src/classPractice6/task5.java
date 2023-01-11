package classPractice6;

            import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        /*5) Write a program to find largest of three double values using if-else..if and logical operators provided
        by a user (numbers must be distinct)
         */
        int number1;
        int number2;
        int number3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your largest number ");
         number1=scan.nextInt();
         number2=scan.nextInt();
         number3=scan.nextInt();


        if(number1>number2&&number1>number3){
            System.out.println("the largest number "+number1);}
        else if (number2>number3&&number2>number1) {
            System.out.println("the largest number is "+number2);}
        else if(number3>number1&&number3>number2){
            System.out.println("the largest number is "+number3);

        }

    }



    }




