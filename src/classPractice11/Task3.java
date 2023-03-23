package classPractice11;

public class Task3 {
    public static void main(String[] args) {
       /* 3) Using 2D array create a grocery list.
                Inside you should have an array of veggies, fruits, dairy and sweets.
                 Retrieve all values from that array using 2 different loops
        */
        String[][] arr = {{"Peper", "cabige", "cucumber", "Brookly"},
                {"Mango", "Orange", "Banana"},
                {"Milk","Butter Milk","Cream"},
                {"RasGulla","Galebi","Gulab jamon"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
            System.out.println();

        }
        for (String [] gro:arr
             ) {
            for (String dairy:gro
                 ) {
                System.out.println(dairy);

            }
            System.out.println();

        }

        }
    }
