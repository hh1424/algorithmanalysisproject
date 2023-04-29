package edu.guilford;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SubjectSort {
    public static void main( String[] args )
    {
        //Define two constants numObject (number of elements in array)
        //and RANGE (the range of random numbers to generate)
        final int numObjects;
        final int RANGE = 10000;
        Random rand = new Random();

        //Ask the user how many random objects do they want to create
        System.out.println("How many random objects do you want to create?");
        Scanner scan = new Scanner(System.in);
        numObjects = scan.nextInt();

        //Create an array of numObjects with random assigned values in RANGE
        int[] subject = new int[numObjects];
        for (int i = 0; i < numObjects; i++) {
            subject[i] = rand.nextInt(1, RANGE + 1);
        }
        // System.out.println("Original array: " + Arrays.toString(subject));

        //Time how long it takes to sort the array
        long startTime = System.nanoTime();
        //Sort the array using the selectionsort method
        Subject.selectionSort(subject);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Selection sort took " + (duration / 1.e6) + " milliseconds.");
        //System.out.println("Sorted array: " + Arrays.toString(subject));

        //Shuffle the array for the next test
        shuffle(subject);
        //Sort the array using quickSort 
        startTime = System.nanoTime();
        Subject.quickSort(subject);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick sort took " + (duration / 1.e6) + " milliseconds.");
        
        shuffle(subject);
        //Use linear search to find the random value
        int randomValue = rand.nextInt(1, RANGE + 1);
        startTime = System.nanoTime();
        int index = Subject.linearSearch(subject, randomValue);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Linear search took " + (duration / 1.e6) + " milliseconds.");
        System.out.println("Linear search found " + randomValue + " at index " + index);


        //Beginning of Binary Search
        //Sort the array using quickSort
        Subject.quickSort(subject);
        //Use binary search to find the random value
        startTime = System.nanoTime();
        index = Subject.binarySearch(subject, randomValue);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Binary search took " + (duration / 1.e6) + " milliseconds.");
        System.out.println("Binary search found " + randomValue + " at index " + index);
    }

    // Add a static method to shuffle the array
    public static void shuffle(int[] subject) {
        // Loop over all the elements in the array
        for (int i = 0; i < subject.length; i++) {
            // Generate a random index between 0 and array.length - 1
            int randomIndex = (int) (Math.random() * subject.length);
            // Swap the current element with the random element
            swap(subject, i, randomIndex);
        }
    }

    // Add a static method to swap two elements in an array
    public static void swap(int[] subject, int i, int j) {
        int temp = subject[i];
        subject[i] = subject[j];
        subject[j] = temp;
    }

}
