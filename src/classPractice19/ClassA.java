package classPractice19;

public class ClassA {
    //@here  HW: Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

    String name;
    int id;
    void info() {
        System.out.println("This is class A");
    }
    }
 class ClassB extends ClassA  {
    String address;
    void add(){
        System.out.println("Main Street");
    }

    }
class ClassC extends ClassB {
    String school;
    void nameSchool(){
        System.out.println("High School");
    }
}
