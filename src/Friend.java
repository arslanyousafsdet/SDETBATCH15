public class Friend {
        /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through
    constructor call. Print users name, mobile number and address in userDetails method. Test your code.*/
    String name;
    int mobileNumber;
    Friend(String name,int mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class GoodFriend extends Friend {
    String address;

    GoodFriend(String name, int mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;

    }

    void printInfo() {
        System.out.println(name + mobileNumber + address);
    }

}
  class UserTester {
      public static void main(String[] args) {


          GoodFriend gf = new GoodFriend("Adem", 32142365, "Main Street");
          gf.printInfo();

      }
  }