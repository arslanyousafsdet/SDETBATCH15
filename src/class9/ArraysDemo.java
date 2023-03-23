package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all the names from array
        String name="Salava";
        String name2="Nabi";
        String name3="jason";
        String name4="safi";
        String name5="anees";
        System.out.println(name2);
        String [] names={"Salava","Safi","jason","Nabi","Joseph"};
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[2]);
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);

        }

        }

    }

