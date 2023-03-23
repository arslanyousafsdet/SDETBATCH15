package classPractice9;

public class Task4 {
    public static void main(String[] args) {

        // 3) Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements
        // of array: “Saturday is Java coding Day”.
     /*   String arr[]={"Java"," Saturday","day","coding","is"};
       arr[0]="Saturday";
       arr[1]="is";
        arr[2]="Java";
       arr[3]="coding";
       arr[4]="day";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");/**/


        String arr[] = {"Java", " Saturday", "day", "coding", "is"};
        arr[0] = "Java";
        arr[1] = "Saturday";
        arr[2] = "day";
        arr[3] = "coding";
        arr[4] = "is";
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[1] + " " + arr[4] + " " + arr[3] + " " + arr[2]);
            break;
        }


    }

}

