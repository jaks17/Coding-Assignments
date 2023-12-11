package codingAsng_java;

import java.util.Scanner;
import java.util.Random;

public class ArrayShuffle_Sanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(originalArray);

        System.out.println("\nPress Enter to shuffle the array...");
        scanner.nextLine(); // Consume the newline after the integer input
        scanner.nextLine(); // Wait for user input

        shuffleArray(originalArray);

        System.out.println("Shuffled array:");
        printArray(originalArray);

        scanner.close();
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            // Swap array[i] and array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

