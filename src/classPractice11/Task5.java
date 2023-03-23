package classPractice11;

public class Task5 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
        int[][] store = {{10, 20, 30},
                {11, 21, 31},
                {9, 19, 29},};

        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j < store[i].length; j++) {
                if (store[i][j] % 2 == 0) {
                    System.out.println(store[i][j]);


                }
            }

        }
    }}