package classPractice9;

import java.util.Scanner;

public class Task1A {
    public static void main(String[] args) {
        /*Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B
        (use 2 different ways of creating an array).

         */
        char arr []={'A','B','C','D','E','F'};
        System.out.println("Grade: "+arr[1]);
        System.out.println("*****************************************");
        //method
        char [] grade=new char[6];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='D';
        grade[4]='E';
        grade[5]='F';
        System.out.println("grade: "+grade[1]);

        }

    }


