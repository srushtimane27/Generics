//UC1:Given an array of integer,double, and character,write a program to print the same

package com.Bridgelabz;

public class PrintArrayUC1 {
    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void toPrint(Double[] inputArray) {
        for (double element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void toPrint(Character[] inputArray) {
        for (int element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','O'};

        PrintArrayUC2.toPrint(intArray);
        PrintArrayUC2.toPrint(doubleArray);
        PrintArrayUC2.toPrint(charArray);

    }

}
