package classPractice5;

public class class9 {

    public static void main(String[] args) {
        int day = 7;

        switch(day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
        }
        double discount;
        char code = 'C' ;

        switch ( code ) {
            case 'A':
                discount = 0.0;

            case 'B':
                discount = 0.1;

            case 'C':
                discount = 0.2;

            default:
                discount = 0.3;
        }

            float fl = 5.3f;
            if (fl == 5.3) {
                System.out.println("Both are equal");
            } else {
                System.out.println("Both are not equal");
            }

            int a = 7 * 3 + 6 / 2 - 5;
            int b = 21 - 8 + a % 3 * 11;

            if(a < b) {
                System.out.println("A is less than B");
            }

            if(a ==b) {

                System.out.println("A is equal to B");
            }

            if(a > b) {
                System.out.println("A is greater than B");
            }}}





