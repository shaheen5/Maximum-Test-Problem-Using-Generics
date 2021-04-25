package com.generics;

public class Maximum {
    //method to determine largest of three comparable objects
    public static <T extends Comparable<T>> T findMaximumValue(T x, T y, T z){
        T max = x; //assume x is initially the largest
        if(y.compareTo(max) > 0){
            max = y; // y is the largest so far
        }
        if(z.compareTo(max) > 0){
            max = z; //z is the largest now
        }
        return max; //returns the largest object
    }

    public static void main(String[] args) {
        System.out.println("Problem To Find Maximum Among Three Using Generics !");
        findMaximumValue(9,5,2);
        findMaximumValue(6.6f,7.8f,8.5f);
        findMaximumValue("Apple","Peach","Banana");
    }
}