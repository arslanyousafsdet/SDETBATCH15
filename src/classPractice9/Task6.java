package classPractice9;

public class Task6 {
    public static void main(String[] args) {
      //  5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
        int [] num={3,5,7,9,11};
        int sum=0;
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
            sum=sum+ num[i];

        }
        System.out.println("The sum of all element is "+sum);


    }


    }



