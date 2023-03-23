package classPractice27;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
       /* 1) Create an ArrayList that will store 5 names into it.
                Find out whether the given ArrayList is empty or not?
                Check whether the specific name is present in an ArrayList or not?
                Find the size of your arrayList and print all values from that*/
        ArrayList <String> names=new ArrayList<>();
        names.add("Nelson");
        names.add("Tariq");
        names.add("Ali");
        names.add("Neseem");
        names.add("Haris");
        System.out.println(names);
        System.out.println("********************************");
        System.out.println(names.contains("Ali"));
        System.out.println(names.contains("Saad"));
        System.out.println("**********************************");

        System.out.println(names.size());
        System.out.println("**************************");

        System.out.println(names.isEmpty());
        System.out.println("*****************************");
        for (int i = 0; i <=names.size(); i++) {
            System.out.println(i);

        }

    }
}
