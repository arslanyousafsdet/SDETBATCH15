package class19;

public class Book2 {
    String author;
    String title;
    int year;

    Book2(String author,String title){
        this.author=author;
        this.title=title;
    }
    Book2(String author,String title,int year){
        this(author,title);
        this.year=year;
    }
    void info(){
        System.out.println("Author:"+author+", Title: "+title+", published: "+year);
    }

    public static void main(String[] args) {

        Book2 book =new Book2("Judy Kerolus", "Java Priciples", 2023 );
        book.info();
    }
}
