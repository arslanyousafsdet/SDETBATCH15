package ClassPractice2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or equals to
5 years than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is larger than 50000
 than bonus = 5000, otherwise bonus=3000.

        * */
        //worked less than 5 years
        Scanner input = new Scanner(System.in);
        System.out.println("enter your worked years");
       // System.out.println("enter your anual Salary")

        int workedYears = input.nextInt();
        if (workedYears >= 5) {
            System.out.println("you are eligible for bonus");
            System.out.println("enter your anual Salary");
        } else {
            System.out.println("you are not eligible for bonus");
        }


            int anualSalary = input.nextInt();
            if (anualSalary > 50000) {
                System.out.println("bonus=5000");
            } else {
                System.out.println("bonus=3000");


            }

    }
}
