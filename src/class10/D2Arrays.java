package class10;

import java.util.Arrays;
import java.util.Scanner;

public class D2Arrays {
    public static void main(String[] args) {
        // a 2D array which can hold 3 one D arrays
        // each of of size 3
        String[] cabin0 = {"Adam", "Zafer", "Sam"};
        String[] cabin1 = {"Nabi", "Saud", "Anees"};
        String[] cabin2 = {"Adam", "Zafer", "Sam"};
        String[][] thomsonTrain = new String[3][3];
        thomsonTrain[0] = cabin0;
        thomsonTrain[1] = cabin1;
        thomsonTrain[2] = cabin2;
        // in the first [] we specify the address of 1 D ARRAY
        System.out.println(thomsonTrain[1][2]);
        System.out.println(Arrays.toString(thomsonTrain[0]));

    }}