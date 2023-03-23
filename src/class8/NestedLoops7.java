package class8;

public class NestedLoops7 {
    public static void main(String[] args) {

        /*012345
        12345
        2345
         */
        for (int i = 0; i<3 ; i++) {
            for (int j = i; j <=5 ; j+=1) {

                System.out.print(j+" ");
            }
            System.out.println();
        }


    }}
