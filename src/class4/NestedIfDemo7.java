package class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;
        if(studyHard){
            System.out.println("we will get the jobs");
            if(salary>100000){
                System.out.println("lets buy Tesla");

            }if(salary>10000){
                System.out.println("lets buy the toyota ");
            }
        }else{
            System.out.println("it might take a little longer to get thejobs");
        }
    }
}
