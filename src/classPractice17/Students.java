package classPractice17;

public class Students {
   /* 2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
    */


           // NOTE: please use different names for instance and local variables.
    String name;
    int math;
    int science;
    int english;
 Students(String sName,int sMath,int sScience,int sEnglish){
        name=sName;
        math=sMath;
        science=sScience;
        english=sEnglish;

    }


    void printGrade(){
        System.out.println(" name"+" "+name+" Math"+" "+math+" Science"+" "+science+" English "+" "+english+" "+
              "And Average numbers are " + (math+science+english)/3);

    }
}
