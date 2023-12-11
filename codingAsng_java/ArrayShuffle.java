package codingAsng_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
	public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);       
        Collections.shuffle(originalList);// Shuffle the ArrayList

        Integer[] shuffledArray = originalList.toArray(new Integer[0]);// Convert the shuffled ArrayList back to an array (if needed)
        System.out.println("Shuffeld list:");
        for (int value : shuffledArray) // Print the shuffled array
        {
            System.out.print(value + " ");
        }
    }

}
