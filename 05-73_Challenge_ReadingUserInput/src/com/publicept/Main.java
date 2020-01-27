package com.publicept;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        /**
         * Solution with for loop
         */
        for(int i=0; i<3; i++) {

            System.out.println("Enter number #" + (i+1) +":");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
                System.out.println("Enter number #" + (i+1) +":");
                scanner.nextLine();   // handle end of line (enter key)
            }
            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
            }
        }


        /**
         * Solution with while loop
         */
//        int counter = 0;
//
//        while (true) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if(isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if(counter >= 3) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid number");
//            }
//
//            scanner.nextLine();     // handle end of line (enter key)
//        }

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
