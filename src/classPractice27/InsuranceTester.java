package classPractice27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class InsuranceTester {
    /*public static void main(String[] args) {
        ArrayList<String>insurance=new ArrayList<>();
        insurance.add("Gieco");
    }/*
}
}

     */
    public static void main(String[] args) {
      /*  Create a Set collection in which you need to add names of the countries. In this set we want all objects to
        be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.*/
        TreeSet<String>countries=new TreeSet<>();
        countries.add("USA");
        countries.add("UK");
        countries.add("USSR");
        countries.add("Itly");
        countries.add("USA");
        System.out.println(countries);
        for (String s:countries
             ) {
            System.out.println(s);
        }



    }
}