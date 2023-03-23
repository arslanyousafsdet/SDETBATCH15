package classPractice7;

public class task3 {
    public static void main(String[] args) {
        // write a loop to print these number 5,10,15,20,25,30.... 50
        for(int i=5;i<=50;i+=5)
        {
            System.out.println(i);
        }
        for(int i=5;i<=50;i++)
        if(i%5==0)
        {
            System.out.println(i);
        }
    }
}