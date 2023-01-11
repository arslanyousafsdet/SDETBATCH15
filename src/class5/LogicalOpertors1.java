package class5;

public class LogicalOpertors1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("i am Happy");
        }else{
            System.out.println("i am sad");}
        boolean wifi=true;
        boolean fiveG=true;
        if(wifi||fiveG){
            System.out.println("you are good for browsing in the internet");}else{
            System.out.println("either conect to wifi or to 5G");

        }
    }
}
