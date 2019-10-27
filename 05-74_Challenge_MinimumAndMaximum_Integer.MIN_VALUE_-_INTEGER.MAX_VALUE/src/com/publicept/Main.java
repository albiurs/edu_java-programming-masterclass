package com.publicept;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int minimumNumber = 0;
//        int maximumNumber = 0;
//        boolean firstRunFlag = true;

        // alternative to the firsRunFlag:
        int minimumNumber = Integer.MAX_VALUE;  // constant form the Integer wrapper class
        int maximumNumber = Integer.MIN_VALUE;  // constant form the Integer wrapper class


        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

//                // firstRunFlag not really needed, see alternative above...
//                if(firstRunFlag) {
//
//                    minimumNumber = number;
//                    maximumNumber = number;
//                    firstRunFlag = false;
//
//                }

                if(number < minimumNumber) {
                        minimumNumber = number;
                    }

                if(number > maximumNumber) {
                    maximumNumber = number;
                }
            } else {
                break;
            }

            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("min number " + minimumNumber);
            System.out.println("max number " + maximumNumber);

        }

        scanner.close();
    }
}
