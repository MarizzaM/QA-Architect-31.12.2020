package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int number_of_rows, number_of_columns;
        // 1
        System.out.println("Task #1");
        number_of_rows = 5;
        number_of_columns = 10;
        int [] arr = new int [number_of_columns];
        for (int i = 0; i < number_of_rows; i++){
            for (int j = 0; j < number_of_columns; j++) {
                arr[j] = j+1;
            }
            for (int j = 0; j < number_of_columns; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        // 2
        System.out.println("Task #2");
        number_of_rows = 4;
        String[] days_of_the_week= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < number_of_rows; i++){
            for (int j = 0; j < days_of_the_week.length; j++){
                System.out.print(days_of_the_week[j] + " ");
            }
            System.out.println();
        }
//         3
        System.out.println("Task #3");
        int [] arr_numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr_powers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr_numbers.length; i++){
            System.out.println(String.format("Powers for number %d", arr_numbers[i]));
            long pow = 1;
            for (int j = 0; j < arr_powers.length; j++){
                pow *= arr_powers[i];
                if (j <= 4){
                    System.out.println(String.format("%d^%d = %d", i+1, j+1, pow));
                }
            }
            System.out.println();
        }
        // 4
        System.out.println("Task #4");
        int [] arr_factorial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr_factorial.length; i++){
            long factorial = 1;
            for (int j = 1; j <= arr_factorial[i]; j++){
                factorial *= j;
            }
            System.out.println(String.format(String.format("Factorial %d! = %d", arr_factorial[i], factorial)));
        }
        // 5
        System.out.println("Task #5");
        System.out.print("Please enter width of the rectangle: ");
        number_of_rows = s.nextInt();
        System.out.print("\nPlease enter length of the rectangle: ");
        number_of_columns = s.nextInt();
        for (int i = 0; i < number_of_rows; i++){
            for(int j = 0; j < number_of_columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 6
        System.out.println("Task #6");
        System.out.print("Please enter width of the rectangle: ");
        number_of_rows = s.nextInt();
        System.out.print("\nPlease enter length of the rectangle: ");
        number_of_columns = s.nextInt();
        for (int i = 0; i < number_of_rows; i++){
            for(int j = 0; j < number_of_columns; j++){
                if (i == 0 || i == number_of_rows-1){
                    System.out.print("* ");
                } else if (j == 0 || j == number_of_columns-1){
                        System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // 7
        System.out.println("Task #7");
        number_of_rows = 5;
        number_of_columns = 5;
        for (int i = 0; i < number_of_rows; i++){
            for(int j = 0; j < number_of_columns; j++){
                if (i<j){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
