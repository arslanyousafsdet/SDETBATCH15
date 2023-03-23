package classPractice27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        //3)Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String>words=new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        //System.out.println(words.remove("e"));
        /*for (String word:words
             ) {         NOT WORKing
            if(word.endsWith("e")){
                words.remove(word);

            }
            System.out.println(words.remove(words));
        }*/
       // words.removeIf(x ->x.endsWith("e"));
        //System.out.println(words);

        System.out.println("************************************");
        // two methods doing same thing

        Iterator<String> iterator= words.iterator();

        while (iterator.hasNext()){
            String s=iterator.next();
            if (s.endsWith("e")){
                iterator.remove();

            }

        }
        System.out.println(words);
    }
    }


