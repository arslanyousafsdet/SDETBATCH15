package class15;

public class MPractice6 {
   /* eCreate a method createEmail(). Based on values of users name, lastName and email type, your method should return
    complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
    */
    String eMail(String firstName,String lastName,String email){

        return firstName.toLowerCase()+lastName.toLowerCase()+"@"+email +".com";
    }

    public static void main(String[] args) {
        MPractice6 creatEmail=new MPractice6();
        System.out.println(creatEmail.eMail("john","Snow","gmail"));
    }
    }

