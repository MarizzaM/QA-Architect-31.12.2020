package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int check = 0;
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
        System.out.println("Please enter code: ");
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
//        16
        System.out.println("\nTask 16");
        String arr_of_word = "Hello world!";
        char[] characters  = arr_of_word.toCharArray();
        System.out.println(String.format("Number of letters in the word '%s': %d", arr_of_word, characters.length));
//        17
        System.out.println("\nTask 17");
        String[] student_names = new String[5];
        int[] student_grades =new int[5];
        for (int i = 0; i < student_names.length; i++){
            System.out.print("Please, enter student name: ");
            student_names[i] = s.next();
            System.out.print(String.format("Now enter %s's grade: ", student_names[i]));
            student_grades[i] = s.nextInt();
        }
        for (int i = 0; i < student_grades.length; i++){
            System.out.println(String.format("%s's grade is %d", student_names[i], student_grades[i]));
        }
//        18
        System.out.println("\nTask 18");
        int[] arr_min_max = new int[10];
        for (int i = 0; i < arr_min_max.length; i++){
            arr_min_max[i] = r.nextInt(20)+1;
        }
        for (int i = 0; i < arr_min_max.length; i++){
            System.out.print(arr_min_max[i] + " ");
        }
        int min = arr_min_max[0], max = arr_min_max[0];
        for (int i = 0; i < arr_min_max.length; i++){
            if (arr_min_max[i] < min){
                min = arr_min_max[i];
            }
            if (arr_min_max[i] > max){
                max = arr_min_max[i];
            }
        }
        System.out.println(String.format("\nMin element of the array is %d", min));
        System.out.println(String.format("Max element of the array is %d", max));
//        19
        System.out.println("\nTask 19");
        String[] arr_words = {"violet", "black", "red", "green", "yellow", "grey", "brown", "lilac", "orange", "coral"};
        System.out.print("Please enter the favorite color: ");
        String word_from_user = s.next();
        check = 0;
        for (int i = 0; i < arr_words.length; i++){
            if (word_from_user.equals(arr_words[i])){
                check++;
                System.out.println(String.format("The color '%s' is the element %d", word_from_user, i+1));
            }
        }
        if (check == 0){
            System.out.println(String.format("The array doesn’t include the color '%s'", word_from_user));
        }
//        20
        System.out.println("\nTask 20");
        int[] arr_before = {1, 2, 3, 4, 5};
        int[] arr_after = new int [arr_before.length];
        for (int i = 1; i < arr_before.length; i++){
            arr_after[i] = arr_before[i-1];
        }
        arr_after[0] = arr_before[arr_before.length-1];
        for (int i = 0; i < arr_after.length; i++){
            System.out.print(arr_after[i] + " ");
        }
//        21
        System.out.println("\nTask 21");
        String[] secret_word = {"H", "E", "L", "L", "O"};
        String[] guessed_word = new String[secret_word.length];
        for (int i = 0; i < guessed_word.length; i++){
            guessed_word[i] = "_";
        }
        int count_of_guess = 0;
        while (count_of_guess < 30){
            check = 0;
            count_of_guess++;
            System.out.print(String.format("\nTry #%d. Please enter letter: ", count_of_guess));
            String letter = s.next();
            for (int i = 0; i < secret_word.length; i++){
                if (letter.equals(secret_word[i])){
                    guessed_word[i] = secret_word[i];
                }
            }
            for (int i = 0; i < guessed_word.length; i++){
                System.out.print(guessed_word [i] + " ");
                if ("_".equals(guessed_word[i])){
                    check++;
                }
            }
            if (check == 0){
                System.out.println("\nYou Won!");
                break;
            }
        }
        if(count_of_guess == 30){
            System.out.println("\nGame Over");
        }
    }
}
