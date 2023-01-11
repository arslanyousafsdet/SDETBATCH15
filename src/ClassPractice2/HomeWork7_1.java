package ClassPractice2;

import java.util.Scanner;

public class HomeWork7_1 {
    public static void main(String[] args) {
        /*create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate
        is higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house,
         if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("what is morgage rate");

        double morgageRates=input.nextDouble();
       if(morgageRates>4.5){
           System.out.println("user is not buying the house");}else{
           System.out.println("user will buying the house");}
        System.out.println("what is house price");


       int housePrice= input.nextInt();
       if(housePrice>200000){
           System.out.println("user will take a loan");}else{
           System.out.println("user will pay cash");}


       }


        }




