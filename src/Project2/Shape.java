package Project2;

public interface Shape {
       /* Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.*/

    void calculateArea();
    void calculatePerimiter();


}
class Circle implements Shape{
    double pi =3.14;
    double radius=3;
    double area=pi*radius*radius;
    double perimeter=2*(pi*radius);
    @Override
    public void calculateArea() {
        System.out.println( "Area Calculation of circle is "+area);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Calculate the Area of the Circle perimiter is"+perimeter);
    }
}
class Square implements Shape{

    double side=4;
    double area=side*side;
    double perimeter=4*side;

    public void calculateArea() {
        System.out.println("Calculate the area of square is "+area);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Calculation of Square is "+perimeter);

    }
}
