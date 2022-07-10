//UC2:Given an array of integer,double, and character,write a program to print the same using generics
////JAVA GENERIC CLASS

package com.Bridgelabz;

public class PrintArrayUC<T> {
    private T[] inputArray;

    public PrintArrayUC(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public void toPrint() {
        PrintArrayUC.toPrint(this.inputArray);
    }

    public static <E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        PrintArrayUC2.toPrint(intArray);
        PrintArrayUC2.toPrint(doubleArray);
        PrintArrayUC2.toPrint(charArray);

    }
}
