package class16;

public class Students {
    /*Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
    You do not have permission to send messages in this channel.
*/
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student st=new Student();
        st.name="Afzal";
        st.id="12STD";
        numberOfStudents++;

        Student st1=new Student();
        st1.name="Namrooz";
        st1.id="13STD";
        numberOfStudents++;

        Student st2=new Student();
        st2.name="Ali";
        st2.id="14STD";
        numberOfStudents++;

        System.out.println("Total number of students: " + numberOfStudents);
    }

    }






