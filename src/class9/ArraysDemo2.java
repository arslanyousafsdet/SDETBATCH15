package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 10 20 30 45 50
int [] numbers={10,20,30,45,50};
        for (int i = 0;i< numbers.length  ; i++) {
            System.out.println(numbers[i]);


        }
        System.out.println("****************************************");
        int [] numbers1={10,20,30,45,50};
        int sum=0;
        for (int i = 0;i< numbers1.length  ; i++) {
             sum=sum+numbers1[i];
           // System.out.println("************************************");
         //   System.out.println(numbers1[i]);


        }
        System.out.println(sum);

            }


        }



