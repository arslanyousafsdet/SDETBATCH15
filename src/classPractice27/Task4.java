package classPractice27;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*Create an arrayList of drinks. If any drink has letter
        “a” or “e” replace it with water.*/
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Coke");
        drinks.add("Orange");
        drinks.add("Sprite");
        drinks.add("Gin");
        for (int i = 0; i < drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("e")&& drinks.contains("a")){
                drinks.set(i,"water");

        }

        }
        System.out.println("Drinks "+drinks);
    }
}
