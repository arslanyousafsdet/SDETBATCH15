package classPractice20;

public class Employee {
    //2. Create an Employee class that will have variables and methods.
    // Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!
    String name;
    String id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public void info() {
        System.out.println("Employees declare your " + name +" "+ id);
    }
}

class FullTimeEmployee extends Employee{
    double salary;
    boolean benefit;

    FullTimeEmployee(String name, String id,double salary,boolean benefit) {
        super(name, id);
        this.salary=salary;
        this.benefit=benefit;
    }
public void bonus(){
    System.out.println("Employees declare your"+" "+name+" "+id+" "+salary+" "+benefit);
}


    }



class PartTime extends FullTimeEmployee{
    String time;
    int hours;
    PartTime(String name, String id,double salary,boolean benefit,String time,int hours) {
        super(name, id,salary,benefit);
        this.time=time;
        this.hours=hours;
    }
    public void schdule(){
        System.out.println("Employee declare your "+ time+" "+hours);
    }
}