package classPractice11;

public class Task4 {
    public static void main(String[] args) {
       // Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
        int [] [] store={{10,20,30},
                {11,21,31},
                {9,19,29},};
        int sum=0;
        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j < store[i].length; j++) {
                sum+=store[i][j];


            }
            System.out.println(sum);

        }
    }
}
