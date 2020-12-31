package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        // 1
        // create and print 3x10 random numbers
        // each row will have 10 random numbers
        int [] arr = new int [10];

        for (int row = 0; row < 3; row++){
            for (int column = 0; column < 10; column++){
                arr[column] = r.nextInt(10)+1;
            }
            for (int column = 0; column < 10; column++){
                System.out.print(arr[column] + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
        // 2
        // input from user number of rows
        // input from user number of columns
        // print the following:
        System.out.print("\nPlease, enter number of rows: ");
        int number_of_rows = s.nextInt();
        System.out.print("\nPlease, enter number of columns: ");
        int number_of_columns = s.nextInt();

        int number = 1;

        for (int row = 0; row < number_of_rows; row++){
            for (int column = 0; column < number_of_columns; column++){
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
        System.out.println("========================");

        // 3
        // *etgar:
        // input from user number of rows
        // input from user number of columns
        // print the following:
        // i.e. 2 rows and 5 column:
        // print row x column (not multiply, just letter 'x'), hint:use format
        // attention: not zero based
        // 1x1 1x2 1x3 1x4 1x5
        // 2x1 2x2 2x3 2x9 2x10

        System.out.print("\nPlease, enter number of rows: ");
        number_of_rows = s.nextInt();
        System.out.print("\nPlease, enter number of columns: ");
        number_of_columns = s.nextInt();

        for (int row = 0; row < number_of_rows; row++){
            for (int column = 0; column < number_of_columns; column++){
                System.out.print(String.format("%dx%d ",row+1, column+1 ));
            }
            System.out.println();
        }
        System.out.println("========================");
    }
}
