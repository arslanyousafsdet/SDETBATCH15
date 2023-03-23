package classPractice27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        //2)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Honda");
        cars.add("Hundai");
        cars.add("Yamaha");
        cars.add("Nissan");
        cars.add("Toyota");
       // for (int i = 0; i < cars.size(); i++) {
           // System.out.println(i);
           // System.out.println("***********************************************");
           // System.out.println(cars.get(i));
            //System.out.println("*************************************************");
            for (String c:cars
                 ) {
               System.out.println(c);

            }
            System.out.println("*************************************************");
           Iterator<String>iterator= cars.iterator();
            while (iterator.hasNext()){
                //System.out.println(iterator);
                //System.out.println("********************************");
              //System.out.println(iterator.hasNext());
                //System.out.println("*******************************");
                System.out.println(iterator.next());
            }


        }
   }
//}
