package codingAsng_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayShuffle_Scannner {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of values (n): ");
	        int n = sc.nextInt();

	        List<Integer> originalList = new ArrayList<>();

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            int value = sc.nextInt();
	            originalList.add(value);
	        }
	        Collections.shuffle(originalList); // Shuffle the ArrayList

	        System.out.println("Shuffled array:");// Print the shuffled array
	        for (int value : originalList) {
	            System.out.print(value + " ");
	        }
	        sc.close();// Close the scanner
	    }
}
