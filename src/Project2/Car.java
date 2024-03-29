package Project2;

public class Car {
  /*  Create a Class Car that would have the
    following fields: carPrice and color and method
    calculateSalePrice() which should be returning
    a price of the car.
            Create 2 sub classes: Sedan and Truck. The Truck
    class has a field as weight and has its own
            implementation of calculateSalePrice() method
    in which returned price is calculated as
    following: if weight>2000 then returned price
    car should include 10% discount, otherwise 20%
    discount.
    The Sedan class has field as length and also
            does it is own implementation of
            calculateSalePrice(): if length of sedan is >20
    feet then returned car price should include 5%
    discount, otherwise 10% discount*/
    int carPrice;
    String color;
    Car(int carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    public int calculateSalePrice(){
        return carPrice;
    }

}
class Sedan extends Car {
    double length;
    int carDiscount;

    Sedan(int carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public int calculateSalePrice() {
        if (length > 20) {
            carPrice -= carPrice * 0.05;

        } else {
            carPrice -= carPrice * 0.010;

        }
        return carPrice;
    }
}
class Truck extends Car{
    double weight;

    Truck(int carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    public int calculateSalePrice() {
        if(weight>2000){
            carPrice-=carPrice*0.1;

        }else{
            carPrice-=carPrice*0.2;
        }
        return carPrice;
    }
}





