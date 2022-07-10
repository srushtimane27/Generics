package com.Assignments;

import com.Bridgelabz.MaximumTest;

public class GenericUC2<T extends Comparable<T>> {
    T x, y, z;

    public GenericUC2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return MaximumTest.maximum(x, y, z);
    }

    //determines the largest of three comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; //y is the largest now
        }
        if (z.compareTo(max) > 0) {
            max = z; //z is the largest now
        }
        printMax(x, y, z, max);
        return max; //returns the largest object
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }
        public static void main(String[] args) {
            Float xFl = 8.8f, yFl = 4.4f, zFl = 5.5f;
            new MaximumTest(xFl, yFl, zFl).maximum();
        }
    }
