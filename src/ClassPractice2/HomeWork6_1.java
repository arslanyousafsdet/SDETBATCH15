package ClassPractice2;

import java.util.Scanner;

public class HomeWork6_1 {
    public static void main(String[] args) {
     /* @hereWrite a program to store a boolean value of whether user has diploma or not. If user has a diploma, you
      should say congratulations, otherwise program should suggest to get a degree. Then if user has a degree program
      should check a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for
       scholarship”, otherwise → “You should have studied harder” .
 */
        Scanner input=new Scanner(System.in);
        System.out.println("do you have Diploma");
                String diploma=input.nextLine();
        if(diploma.equals("yes")){
            System.out.println("congratulation");}else if(diploma.equals("no")){
            System.out.println("get a degree");}  {

        }
        System.out.println("do you have Degree");
       String degree= input.next();
        {
            System.out.println("what is your GPA score");

        }
    }
}
