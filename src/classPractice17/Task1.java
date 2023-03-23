package classPractice17;

public class Task1 {
   /* 1) Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.

    */
    String name;
    String make;
    String model;
    int price;
    int year;
    Task1(String cName,String cMake,String cModel,int cPrice,int cYear){
        name=cName;
        make=cMake;
        model=cModel;
        price=cPrice;
        year=cYear;
    }

    void printInfo(){
        System.out.println("Name"+" "+name+" Make"+" "+make+" Model"+" "+model+" Price"+" "+price+" Year"+" "+year);
    }
}
