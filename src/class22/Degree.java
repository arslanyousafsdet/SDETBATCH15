package class22;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need Bachloar Degree");
    }

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need Master Degree");}

}
class DegreeTester{
    public static void main(String[] args) {
        Degree dg=new Degree();
        dg.getPrerequisite();
        Bachelors bc=new Bachelors();
        bc.getPrerequisite();
        Masters ms=new Masters();
        ms.getPrerequisite();

    }
}