package org.example;

import static java.lang.Long.sum;

public class Main {
    public static void main(String[] args) {
// Coding tasks 1
//Create a program that uses an array to store a list of temperatures for a week,
//and then uses a loop to find the highest and lowest temperature for the week.
        int[] Temps = {78, 82, 72, 88, 87, 92, 77};

        int largest = Temps[0];
        int smallest = Temps[0];
        for (int i = 0; i < Temps.length; i++) {

            if (Temps[i] > largest) {
                largest = Temps[i];
            }
            if (Temps[i] < smallest) {
                smallest = Temps[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);


//Coding tasks 2
//Create an array of integer values. After the array is created, calculate the
//sum of all stored elements in that array.
        int[] arr = {250, 45, 88, 560, 92, 88, 75};
        int sum = 0;
        for (int n : arr) {
            sum = sum + n;
        }

        System.out.println(sum);
// Coding tasks 3
//Create a 2D array or integer type where you will store odd and even
//numbers. Develop a program which will identify/print the even numbers
//only.
        int[][] Numbers = {{45, 35, 22, 101, 39, 88},
                {33, 44, 99, 128},
                {1, 48, 11}};

        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[i].length; j++) {
                if (Numbers[i][j] % 2 == 0) {
                    System.out.print(Numbers[i][j]);
                }
            }
        }
//Coding tasks 4
//Create a 2D array of integers. Develop a program which will calculate the
//sum of even and odd numbers for that array.
    int[][] numbers = {{45, 35, 22, 101, 39, 88},
                       {33, 44, 99, 128},
                       {1, 48, 11}};
    int oddSum = 0;
    int evenSum = 0;

        for(int[] row:numbers) {
            for (int n : row) {
              if (n % 2 == 0) {evenSum += n;}
              else {oddSum += n;}}

        System.out.println(oddSum);
        System.out.println(evenSum);
        }

    // Coding tasks 5
//Write a program to swap 2 numbers without a temporary variable?
    int a = 81;
    int b = 99;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a "+a);
    System.out.println("b "+b);

//Coding tasks 6
//Write a java program to check whether a given number is prime or not?
        int whether = 97;
        boolean isPrime = true;

        for (int i = 2; i < whether; i++) {
            if (whether % i == 0) ;{isPrime = false;} }

        System.out.println(isPrime);

// Coding tasks 7
//Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n=10;
        int first=0;
        int second=1;
        int next=0;

        System.out.println("0 1");
        for (int i = 0; i < n-2; i++);{
            next=first+second;
            System.out.println(next+" ");
            first=second;
            second=next;

        }

// Coding tasks 8
//Maximum and minimum number in the array?
        int[] number = {34, 55, 77, 34, 25};
        int max = number[0];
        int min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

// Coding tasks 9
//Write a java program to find the second largest number in the array?
        int[] temps = {23, 97, 34, 99, 43};
        int largests = temps[0];
        int secondLargest = temps[0];

        for (int i = 0; i < temps.length; i++) {
             if (temps[i] > largests) {largests = temps[i];} }

        System.out.println(largests);

// Coding tasks 10
//Write a program to print out duplicate elements from an Array of Strings?
         String[] Names={"Maher","Michel","Georgia"};

            for (int i = 0; i<Names.length; i++){

                for(int j = i; j < Names.length; j++){

                if (Names[i].equals(Names[j])&& i!=j)
                {System.out.println(Names[i]);}
                }}

    }}