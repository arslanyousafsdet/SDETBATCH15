package classPractice5;

            import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
      /*  4)Write a program for user to enter his/hers birth month. Based on the month define the season.
                Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”. (edited)
                [2:59 PM]*/

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your birth month");
        String month=scan.next();
        if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("Feburary")||month.equalsIgnoreCase("December")
        ||month.equalsIgnoreCase("November")){
            System.out.println("Winter Season");}
        else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
            System.out.println("Spring Season");}
        else if(month.equalsIgnoreCase("june")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
            System.out.println("Summer Season");}
        else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")){
            System.out.println("Autumn Season");


        }
String sum=month;
        System.out.println("You were born in "+sum);


    }
        }



