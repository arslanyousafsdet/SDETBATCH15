package classPractice7;

public class task2 {
    public static void main(String[] args) {
        // write a loop to print odd numbers from 1 to 15
        for (int i = 1; i < 15; i += 2) {
            System.out.println(i);

        }
        for (int i = 1; i < 15; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }
}