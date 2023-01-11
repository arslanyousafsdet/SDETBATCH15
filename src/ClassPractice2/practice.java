package ClassPractice2;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
      /*  Write a Java program to convert minutes into a number of years and days. Go to the editor

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
       */

        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number of mintues");
        int minutes =sc.nextInt();
        int hour=60;
        int day=minutes/1440;
        int year=day/365;
        System.out.println(minutes+" minutes is approxmetly "+year+" years "+ " and "+day+" days");

    }


}














