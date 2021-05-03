package com.generics;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Arrays.*;

public class Maximum <T extends Comparable<T>> {
    T x, y, z;

    public Maximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Maximum() {}

    //method to determine largest among all
    public Optional<T> findMaximumValue(T... parameters) {
        Optional<T> max;
        max = stream(parameters).sorted(Comparator.reverseOrder()).findFirst();
        printMaximumValue(max,parameters);
        return max;
    }
    //method to display largest among all
    private void printMaximumValue(Optional<T> max, T ...parameters){
        System.out.print("Elements :");
        for(T element : parameters)
            System.out.print(element+" ");
        System.out.println("\nMaximum Element ="+max);
    }


    public static void main(String[] args) {
        System.out.println("Problem To Find Maximum Among Three Using Generics !");
        Maximum maximum = new Maximum();
        maximum.findMaximumValue(9, 5, 2);
        maximum.findMaximumValue(6.6f, 7.8f, 8.5f);
        maximum.findMaximumValue("Apple", "Peach", "Banana");
        maximum.findMaximumValue(2, 5, 7, 1, 8);
    }
}