package com.timbuchalka;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
         * References
         */
	    Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // copy reference -> assign second to point to the first class
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance()); // = 12.18


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++) {
            /*
            0: 1
            1: 3
            2: 4
             */
            System.out.println(i +": " + intList.get(i));
        }

        /*
         * ArrayList.add(index, element)
         */
        intList.add(1, 2); // add the number 2 into index pos 1

        for(int i=0; i<intList.size(); i++) {
            /*
            0: 1
            1: 2 <--
            2: 3
            3: 4
             */
            System.out.println(i +": " + intList.get(i));
        }

    }
}
