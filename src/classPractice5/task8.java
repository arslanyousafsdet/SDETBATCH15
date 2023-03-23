package classPractice5;

            import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {
      /*  Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other
    grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Grades");
        char grades=scan.next().charAt(0);
        switch(grades){
            case'A':
                System.out.println("You are Excelent");
                break;
            case 'B':
                System.out.println("you are Good ");
                break;
            case 'C':
                System.out.println("you are avarge");
                break;
            case 'D':
                System.out.println("You are Bad");
            default:
                System.out.println("Not Acceptable");


        }
        }

        }









