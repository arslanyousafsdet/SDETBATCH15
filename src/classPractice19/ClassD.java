package classPractice19;

public class ClassD {
 //   Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    static void print(){
        System.out.println("Print F");

    }
}
class ClassE extends ClassD{

static void reuse(){
    print();
}

    public static void main(String[] args) {
        ClassE c=new ClassE();
        c.reuse();
    }

    }


