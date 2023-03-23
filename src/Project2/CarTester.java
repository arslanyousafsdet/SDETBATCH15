package Project2;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Sedan(10000,"Black",2100);
        System.out.println(car.calculateSalePrice());

        Car truck=new Truck(50000,"White",1000);
        System.out.println(truck.calculateSalePrice());

    }
}
