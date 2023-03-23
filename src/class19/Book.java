package class19;

public class Book {
    String name;
    String topic;
    int pages;
    int price;
    String color;

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    Book(String topic) {
        this.topic = topic;


    }


    Book(String name, String topic, int pages, int price, String color) {
        this(name, pages);
        this.topic = topic;
        this.price = price;
        this.color = color;


    }







    public void info(String name) {
        System.out.println("this Book name is " + " " + "And this book has" + pages + "thib book topic is "
                + "This book price is " + price + "this book color is " + color);}}




   /* Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
    You do not have permission to send messages in this channel.*/

