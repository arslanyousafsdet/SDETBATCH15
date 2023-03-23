package classPractice19;

public class Teacher {
   /* Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses
    MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes*/
    String name;
    int id;
    char sex;
    boolean goodTeacher;
   static void time(){
        System.out.println("Teacher coming on time ");}
      static void teaching(){
            System.out.println("Teaching good");}
            static void info(){
                 System.out.println("Teacher has good info");

            }
            void grades(){
                System.out.println("Teacher gives good grades");
            }

        }
    class mathTeacher extends Teacher{
    String mtName;
    void math(){
        System.out.println("Math teacher teaching math");

    }
    }
    class chemTeacher extends Teacher{
    int age;
    void chem(){
            System.out.println("What is math teacher age ");

        }
    }
class pianoTeacher extends Teacher{
    String song;
    void piano(){
        System.out.println("Teacher play good piano");
    }
}
