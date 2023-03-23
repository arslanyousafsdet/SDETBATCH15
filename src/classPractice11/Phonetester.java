package classPractice11;

public class Phonetester {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.name="iPhone";
        phone1.color="Black";
        phone1.price=500;
        phone1.screenSize=3.4;
        phone1.sepBettery=false;


        Phone phone2=new Phone();
        phone2.name="pixel";
        phone2.color="white";
        phone2.sepBettery=true;

        Phone phone3=new Phone();
        phone3.name="Samsung";
        phone3.color="Pink";
        phone3.price=600;
        phone2.ring();
        phone1.songs();
        phone3.charing();
        System.out.println(phone1.color);
        System.out.println(phone2.sepBettery);
        System.out.println(phone3.price);

    }
}
