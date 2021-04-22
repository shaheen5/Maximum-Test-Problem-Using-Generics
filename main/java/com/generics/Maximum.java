package com.generics;

public class Maximum {
    //method to find maximum among three integers
    public static Integer findMaximumInteger(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMaximumValue(x, y, z, max);
        return max;
    }
    //method to display maximum value among three integers
    private static void printMaximumValue(Integer x, Integer y, Integer z, Integer max){
        System.out.println("Maximum integer value is : "+max);
    }
    public static void main(String[] args) {
        System.out.println("Problem To Find Maximum Among Three Using Generics !");
        findMaximumInteger(9,5,2);
    }
}
