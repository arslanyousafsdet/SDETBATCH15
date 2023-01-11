package class5;
import  java.util.Scanner;
public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
      /*  System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");
        System.out.println("please enter you weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is  "+weight);
        System.out.println("Are you Hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("please enter you gernder");
        char gender=scan.next().charAt(0);arsla

        System.out.println("YOur gender is "+gender );*/
        System.out.println("please enter your name ");
        String name=scan.next();
        System.out.println("your name us "+name);
        scan.nextLine();
        System.out.println("please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("your full name is "+fullName);
        scan.close();




    }
}
