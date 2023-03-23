package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo4 {
    public static void main(String[] args) {


        LinkedList<String> subject = new LinkedList<>();
        subject.add("SDLC");
        subject.add("ManualTesting");
        subject.add("Jira");
        subject.add("Git");
        subject.add("Java");


        LinkedList<String> futureSubject = new LinkedList<>();
        futureSubject.add("Selinum");
        futureSubject.add("Testing");
        futureSubject.add("Cucumber");
        futureSubject.add("SQl");
        futureSubject.add("Apis");
        futureSubject.add("Jenkins");

        LinkedList<String> allSubjects = new LinkedList<>();
        allSubjects.addAll(subject);
        allSubjects.addAll(futureSubject);
        System.out.println(allSubjects);

        ArrayList<String> word = new ArrayList<>();

        word.add("Cat");
        word.add("Java");
        word.add("Computer");
        word.add("Lava");
        word.add("Selinum");
        for (String s : word
        ) {
          /*  if(s.endsWith("a")){
                word.remove(s);
            }
            System.out.println(word);
        }*/

        }


    }
}
