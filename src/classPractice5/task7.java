package classPractice5;

            import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
       // Ask user to enter their country and capture it. Once values are captured print which language user speaks
        Scanner scan=new Scanner(System.in);
        System.out.println("where are you from" );
        String language=scan.next();
        if(language.equalsIgnoreCase("India")){
            System.out.println("You speak Hindi");}
        else if(language.equalsIgnoreCase("Pakistan")){
            System.out.println("You speak Urdu");}
        else if(language.equalsIgnoreCase("China")){
            System.out.println("You speak chines");
        }else{
            System.out.println("Wrong Country");
        }
        System.out.println("************************************************************************");
        System.out.println("where are you from" );
        String lang=scan.next();
        switch(lang){
            case "Egypt":
                System.out.println("You speak Arabic");
                break;
            case "Russia":
                System.out.println("You Speak Russian");
                break;
            case "Japan":
                System.out.println("Japanes");
                defualt:
                System.out.println("Wrong country");

        }

        }




    }




