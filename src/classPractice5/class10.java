package classPractice5;

public class class10 {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        if (x || y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        boolean male = false;
        int age = 30;

        if( male ){
            if( age < 20 ){
                System.out.println("Boy");
            } else {
                System.out.println("Man");

            }
        }else {

            if( age < 20 ){
                System.out.println("Girl");
            }else  {
                System.out.println("Woman");
            }
        }
        float f = 75.0f;
        double d = 75.0;
        int i = 75;

        if( f == d ) {
            if( f == i ) {
                System.out.println("f, d and i are equal");
            } else {
                System.out.println("f, d are equal but i is not equal");
            }

        } else {
            System.out.println("f and d are not equal");
        }
    }
}