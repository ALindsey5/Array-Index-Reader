package com.mycompany.arrayindexreader;

import java.util.Scanner;

public class ArrayIndexReader {
    public static void main(String[] args) {
        // Create an array of 10 integers
        int[] arr = new int[10];

        // Initialize the array with some values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;  // Example values: 0, 10, 20, ..., 90
        }

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to enter the index
            System.out.print("Enter the index of the element (0-9): ");
            int index = scanner.nextInt();

            // Display the element at the specified index
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the index is out of bounds
            System.out.println("Error: Index out of bounds. Please enter a value between 0 and 9.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions (e.g., invalid input)
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}

