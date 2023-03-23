package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
     boolean summner=true;  int temp=75;
     while(summner){
         if(temp<=100){
             System.out.println("i love summer beacuse tempature is "+ temp);}else{
             System.out.println("its very hot"+ temp);
             break;
         }temp+=5;
     }
     /*   System.out.println("*************************************************************");

        int temp2=75;
        while(temp<=105){
            if(temp<=100){
                System.out.println("i lover summber");}else{
                System.out.println("its too hot");

            }
        }temp+=5;*/
       /* int i;
        for(i =75; i<=100; i+=5){
            System.out.println("I love summer because temp is"+i);
        }
        System.out.println("it is very hot"+i);
        int temp3=75;

        while (temp3<=105){
            if(temp3<=100){
                System.out.println("I love summer because Temperature is "+temp3);
            }else {
                System.out.println("Its very hot "+temp3);
            }
            temp3+=5;
        }*/
    }


}
