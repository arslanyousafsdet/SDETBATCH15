package classPractice20;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee("Saud","Pk1122");
        employee.info();

        FullTimeEmployee ft=new FullTimeEmployee("Urwa","Pk1123",52000,true);
        ft.info();
        ft.bonus();
        PartTime pt=new PartTime("Jameel","Pk1125",500.25,false,"Part",20);
        pt.info();
        pt.schdule();
    }
}
