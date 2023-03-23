package classPractice11;

public class Task6 {
    public static void main(String[] args) {
       /* Create 2D array of countries: north america countries, south america countries, europe countries, asian
        countries, african countries. Then print all values from that array using 2 different loops and calculate
        how many total countries been stored*/
        String [][] countries={{"USA","Canada","Maxico"},
                {"Brazil","Chile","Malta"},
                {"Itly","France","Spain"},
                {"Pakistan","India","Bangladesh"},
                {"South Africa","Eygpt","Sodan"}};
        int sum=0;
        for (int i = 0; i < countries.length ; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sum++;
                System.out.println(countries[i][j]);


            }
            System.out.println();

        }
        System.out.println(sum);

        }
    }

