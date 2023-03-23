package class8;

public class NestedLoops8 {
    public static void main(String[] args) {

        /*012345
        1246810
        03691215
         */
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();


        }


        for (int i = 0; i <=5; i++) {
            System.out.print(1*i+" ");
        }
        System.out.println();
        for (int i = 0; i <=5; i++) {
            System.out.print(2*i+" ");
        }

        for (int i = 0; i <=5; i++) {
            System.out.print(3*i+" ");
        }
    }
}

