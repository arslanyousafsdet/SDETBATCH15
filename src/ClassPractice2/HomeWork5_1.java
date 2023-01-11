package ClassPractice2;

import java.util.Scanner;

public class HomeWork5_1 {
    public static void main(String[] args) {
       /* Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit
        into celsius and print “The temperature is the city  is ”
        */
        Scanner input=new Scanner(System.in);
        System.out.println("write your city name");
        String city= input.next();
        System.out.println("what is your city temperature");
        double temperature= input.nextDouble();
        System.out.println("The temperature in the "+city+ " is " + (temperature- 32)*5/9);
    }
}
