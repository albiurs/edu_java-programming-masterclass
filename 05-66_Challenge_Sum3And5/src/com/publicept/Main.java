package com.publicept;

public class Main {

    public static void main(String[] args) {

//        Create a for statement using a range of numbers from 1 to 1000 inclusive.
//        Sum all the numbers that can be divided with both 3 and also with 5.
//        For those numbers that met the above conditions, print out the number.
//        break out of the loop once you find 5 numbers that met the above conditions.
//        After breaking out of the loop print the sum of the numbers that met the above conditions.

        int sum = 0;
        int count = 0;

        for(int i=1; i<=1000; i++) {

            if(isDividableByThreeAndFive(i)) {
                System.out.println("Dividable by 3 and 5: " + i);
                count++;
                sum = sum + i;
            }

            if(count > 5) break;
        }

        System.out.println("Sum of found numbers: " + sum);

    }


    /**
     * Check if dividable by three and five
     * @param number
     * @return
     */
    public static boolean isDividableByThreeAndFive(int number) {
        return (number % 3 == 0 && number % 5 == 0);
    }
}
