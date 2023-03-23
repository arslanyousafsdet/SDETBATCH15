package class12;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”*/

                   Scanner scan=new Scanner(System.in);
        System.out.println("please enter your username ");
        String username=scan.next();
        System.out.println("please enter your password");
        String password=scan.next();
        System.out.println("please Re- enter your password");
        String confirmPassword=scan.next();
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("user name and password cannot be empty");}
        else if(password.length()<8){
            System.out.println("Password is too short");}
        else if(password.contains(username)){
            System.out.println("PAssword cannot contain username ");}
        else if (password.equals(confirmPassword)) {
            System.out.println("password do not match");} else {
            System.out.println("your user name and password has been created ");

        }

    }


    }










