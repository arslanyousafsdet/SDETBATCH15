package classPractice22;

import org.w3c.dom.ls.LSOutput;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
    interest based on the given balance.

            Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes./*/
    double balance;
    double interest;
public void calculation(){
    System.out.println("The interest rate is "+(balance*interest)/100);
}
}
class Visa extends CreditCard{
  public void calculation(){
      System.out.println("Visa interest rate is ");

  }
}
class Ax extends CreditCard{
    double balance=500.00;
    double interest=10.5;

    @Override
    public void calculation() {
        System.out.println("The interest rate is "+(balance*interest)/100);
    }
}
class CreditCardTester{
    public static void main(String[] args) {
    CreditCard cd=new CreditCard();
    cd.calculation();
     Ax ax=new Ax();
     ax.calculation();

    }
}