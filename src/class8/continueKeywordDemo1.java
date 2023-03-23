package class8;

public class continueKeywordDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if(i%3==0){
                continue;  // skip
            }else {
                System.out.println(i);

            }
            System.out.println("Hello Java");

        }
        System.out.println("*********************************************************");

        for (int i = 0; i < 10; i++) {

            if (i == 3 || i == 6 || i == 9) {
                continue;  // skip
            }

            System.out.println(i); // this line is skipped when i =3,6,9
        }
    }
}
