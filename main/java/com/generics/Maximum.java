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
        System.out.println("Maximum integer value among "+x+" , "+y+" , "+z+" is :"+max);
    }
    //method to find maximum among three float values
    public static Float findMaximumFloat(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMaximumValue(x, y, z, max);
        return max;
    }
    //method to display maximum value among three floats
    private static void printMaximumValue(Float x, Float y, Float z, Float max){
        System.out.println("Maximum float value among "+x+" , "+y+" , "+z+" is :"+max);
    }
    //method to find maximum among three strings
    public static String findMaximumString(String x, String y, String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMaximumValue(x, y, z, max);
        return max;
    }
    //method to display maximum among three strings
    private static void printMaximumValue(String x, String y, String z, String max){
        System.out.println("Maximum String value among "+x+" , "+y+" , "+z+" is :"+max);
    }
    public static void main(String[] args) {
        System.out.println("Problem To Find Maximum Among Three Using Generics !");
        findMaximumInteger(9,5,2);
        findMaximumFloat(6.6f,7.8f,8.5f);
        findMaximumString("Apple","Peach","Banana");
    }
}