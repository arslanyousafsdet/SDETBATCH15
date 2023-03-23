package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        // arr[1]=0; This is how we update a single element in an array
        // print only the odd numbers from this array with the help of normal for loop
int [ ] arr={10,13,20,25,45,50};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
        }


        }System.out.println("******************************************");
        int [ ] arr1={10,13,20,25,45,50};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0){
                arr1[i]=0;

            }
        }
        System.out.println("After replaceing all odd numbers with zeros");
        for (int j : arr1) {
            System.out.println(j);

        }
        }
    }

