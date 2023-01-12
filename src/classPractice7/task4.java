package classPractice7;

public class task4 {
    public static void main(String[] args) {
        // Print even numbers from 20 to 1 (2 ways)
        int num = 20;
        while (num >= 0) {
            System.out.println(num);
            num -= 2;
        }
        System.out.println("**********************************************");
        int number = 20;
        while (number >= 1) {
            if (number % 2 == 0) {
                System.out.println(number);

            }number--;
        }


    }
}