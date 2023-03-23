package class10;

import java.util.Arrays;
import java.util.Scanner;
public class ScannerAndArrays {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("please enter 5 number ");
       int[]numbers=new int[5];
        //below code manually store numbers in the array
    /*    numbers[0]=40;
        numbers[1]=50;
        numbers[3]=60;
        numbers[2]=70;
        numbers[4]=80;*/

        // Below code take the numbers from user and store them in the array its good but a lot of code



      /*  int [] numbers=new int[5];
        numbers[0]=scan.nextInt();
        numbers[1]=scan.nextInt();
        numbers[3]=scan.nextInt();
        numbers[2]=scan.nextInt();

        numbers[4]=scan.nextInt();*/
        // below coe uses a normal for loop to ask the user for numbers and store them in the array
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        }
    }

