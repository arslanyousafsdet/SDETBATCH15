package Project2;

public class MarksTester {
    public static void main(String[] args) {


       StudentA a = new StudentA(75, 85, 95);

        System.out.println( a.getPercentage());
        StudentB b = new StudentB(90, 80, 70, 60);
        System.out.println(b.getPercentage());


    }

}
