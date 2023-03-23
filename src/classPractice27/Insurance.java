package classPractice27;

public class Insurance {
    /*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
        and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and
    Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. Using for
    loop/advanced for loop/ iterator access all methods of the class.


4

2
*/
    public String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public  void getQuote(){

    }
    public  void cancelInsrueance(){

    }
}
class Car extends Insurance{
   private String carModel;

    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;


    }

    @Override
    public void getQuote() {
        System.out.println("What is your car model to get quote");
    }

    @Override
    public void cancelInsrueance() {
        System.out.println("you can cancel your insurance any time");
    }


}

class Pet extends Car{
    String petType;
    Pet(String insuranceName,String petType,String carModel){
        super(insuranceName,carModel);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("What is age of your dog");
    }

    @Override
    public void cancelInsrueance() {
        System.out.println("You can cancel insurance any time ");
    }
}
class Health extends Car{
    Health(String insuranceName, String carModel) {
        super(insuranceName, carModel);
    }

    @Override
    public void getQuote() {
        System.out.println("this is your health insurance");
    }

    @Override
    public void cancelInsrueance() {
        System.out.println("You can cancel your insurance any time ");
    }
}