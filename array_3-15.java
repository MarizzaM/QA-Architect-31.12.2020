package com.company;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int check = 0;
//
//     3
        System.out.println("Task 3");
        int [] arr = {2, 4, 6};
        System.out.println(String.format("First element: %d", arr[1]));
        System.out.println(String.format("Last element: %d", arr[2]));

//        4
        System.out.println("Task 4");
        System.out.println(String.format("Last element (arr.length): %d", arr[arr.length-1]));

//        5
        System.out.println("Task 5");
        int [] arr_new = new int [20];
        for (int i = 0; i < arr_new.length; i++){
            System.out.print(arr_new[i] + " ");
        }

//        6
        System.out.println("\nTask 6");
        String [] arr_str = {"Welcome", "To", "Java"};
        for (int i = 0; i < arr_str.length; i++){
            System.out.print(arr_str[i] + " ");
        }
//        7
        System.out.println("\nTask 7");
        int [] array = {-1, -2, -3, -4, -5};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
//        8
        System.out.println("\nTask 8");
        int [] arr_odd = new int [10];
        int num = 1;
        for (int i = 0; i < arr_odd.length; i++){
            arr_odd[i] = num++;
        }
        for (int i = 0; i < arr_odd.length; i += 2){
            System.out.print(arr_odd[i+1] + " ");
        }
//        9
        System.out.println("\nTask 9");
        for (int i = arr_odd.length; i > 0; i -= 2){
            System.out.print(arr_odd[i-1] + " ");
        }
//        10
        System.out.println("\nTask 10");
        int [] arr_user = new int [3];
        System.out.println("Please enter array's elements: ");
        for (int i = 0; i < arr_user.length; i++){
            arr_user[i] = s.nextInt();
        }
        for (int i = 0; i < arr_user.length; i ++){
            System.out.print(arr_user[i] + " ");
        }
//        11
        System.out.println("\nTask 11");
        int [] arr_rand = new int [5];
        for (int i = 0; i < arr_rand.length; i++){
            arr_rand[i] = r.nextInt(50)+1;
        }
        for (int i = 0; i < arr_rand.length; i ++){
            System.out.print(arr_rand[i] + " ");
        }
//        12
        System.out.println("\nTask 12");
        check = 0;
        for (int i = 0; i < arr_rand.length; i ++){
            if(arr_rand[i]%2 == 0){
                check++;
            }
        }
        if (check == arr_rand.length){
            System.out.println("All numbers are even");
        } else {
            System.out.println("Not all numbers are even");
        }
//        13
        System.out.println("\nTask 13");
        check = 0;
        int [] arr_a = {1, 2, 4, 4, 5};
        int [] arr_b = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr_a.length; i++){
            if (arr_a[i] == arr_b[i]){
                check++;
            }
        }
        if (check++ == arr_a.length){
            System.out.println("Identical arrays");
        } else {
            System.out.println("Not identical arrays");
        }
//        14
        System.out.println("\nTask 14");
        check = 0;
        int [] arr_A = {6, 4, 9};
        int [] arr_B = new int [3];
        for (int i = 0; i < arr_B.length; i++){
            arr_B[i] = s.nextInt();
        }
        for (int i = 0; i < arr_A.length; i++){
            if (arr_A[i] == arr_B[i]){
                check++;
            }
        }
        if (check == arr_A.length){
            System.out.println("Access Granted!");
        } else {
            System.out.println("Wrong!");
        }

//        15
        System.out.println("\nTask 15");
        System.out.print("Please enter word: ");
        String word = s.next();
        char[] result = word.toCharArray();
        System.out.println(String.format("Number of letters in the word '%s': %d", word, result.length));

    }
}
