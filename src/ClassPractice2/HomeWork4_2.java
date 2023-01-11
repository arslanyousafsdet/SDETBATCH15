package ClassPractice2;

import java.util.Scanner;

public class HomeWork4_2 {
    public static void main(String[] args) {
        /*4You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue a
        driver licence to them, otherwise you will offer them to get a learners permit.
         */
        //age is less than
        Scanner input=new Scanner(System.in);
        System.out.println("how old are you?");
        int age= input.nextInt();

        if(age>=18){
            System.out.println("you will issued the license");}else{
            System.out.println("i will offer you to get a learners permit.");
        }
    }
}
