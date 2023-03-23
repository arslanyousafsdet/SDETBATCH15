package classPractice17;

public class Student {
    /*5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address
    of given  student using displayInfo method.*/
    String name;
    String address;
    Student(String name,String address){
        this.name=name;
        this.address=address;

        }
        public void info(){
            System.out.println("My name is "+name+" "+address);
    }


}
class StudentTester{
    public static void main(String[] args) {
        Student st=new Student("Saud","Main Street");
        st.info();
        System.out.println(st.name);
        System.out.println(st.address);

    }



}