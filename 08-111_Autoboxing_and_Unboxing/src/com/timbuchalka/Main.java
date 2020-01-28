package com.timbuchalka;

import java.util.ArrayList;


/**
 * Main
 *
 */
public class Main {

    public static void main(String[] args) {

	    String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");


        /*
         * Custom WrapperClass "IntClass"
         */
//        ArrayList<int> intArrayList = new ArrayList<int>(); // error: Type argument cannot be of primitive type!
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>(); // type argument = custom IntClass = bad paractice
        intClassArrayList.add(new IntClass(54));


        /*
         * Wrapper class showcase (Integer and Double)
         */
        Integer integerValue = new Integer(54); // manual boxing
        Double doubleValue = new Double(12.25); // manual boxing


        /*
         * WrapperClass
         * ArrayList<WrapperClass>
         */
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            /*
             * Autoboxing
             */
            intArrayList.add(Integer.valueOf(i));// boxing -> manually convert primitive type into WrapperClass
//            intArrayList.add(i); // autoboxing -> automatically convert primitive type into WrapperClass
        }

        for(int i=0; i<=10; i++) {
            /*
             * Unboxing
             */
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // unboxing
//            System.out.println(i + " --> " + intArrayList.get(i));            // auto-unboxing
        }
        System.out.println();



        /*
         * Autoboxing
         */
        Integer myIntValue = 56; // compiled by Java to -> Integer.valueOf(56);

        /*
         * Auto-Unboxing
         */
        int myInt = myIntValue; // compiled by Java to -> myIntValue.intValue();



        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            /*
             * Autoboxing
             */
//            myDoubleValues.add(Double.valueOf(dbl)); // manual boxing
            myDoubleValues.add(dbl); // autoboxing
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            /*
             * Auto-Unboxing
             */
//            double value = myDoubleValues.get(i).doubleValue(); // manual unboxing
            double value = myDoubleValues.get(i); // auto-unboxing
            System.out.println(i + "  --> " + value);
        }
    }
}


/**
 * IntClass
 * Custom int-Wrapper class
 * IntClass(int myValue)
 *
 * getMyValue()
 * setMyValue(int myValue)
 */
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}