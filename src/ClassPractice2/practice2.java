package ClassPractice2;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner selab=new Scanner(System.in);
        int length=18;
        int width=16;
        System.out.println("Please enter the length");
        int lenth=selab.nextInt();
        System.out.println("Please enter the width");
        width=selab.nextInt();
        if(length>width){
            System.out.println("The shape of your objectis rectangle");}
        else{
            System.out.println("The shape os your object is square");
        }
    }
}
