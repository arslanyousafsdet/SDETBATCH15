package classPractice5;

            import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
      /*  6)Write a program to find largest number among three numbers using nested if provided by a user
       (numbers must be distinct) (edited)
       */
        double number1, number2, number3;
               Scanner scan=new Scanner(System.in);
        System.out.println("Find the largest number in three numbers");
        number1=scan.nextDouble();
        System.out.println("Find the largest number in three numbers");
        number2=scan.nextDouble();
        System.out.println("Find the largest number in three numbers");
         number3=scan.nextDouble();



        if(number1>number2&&number1>number3);{
            System.out.println("the largest number is  "+number1);
        }
        if(number2>number1&&number2>number3);{
        System.out.println("the largest number is 2 "+number2);}
        if(number3>number1&&number3>number2);{
        System.out.println("the largest number is 3 "+number3);}

        }




    }




