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
        System.out.println("How many Subjects do you want to create?");
        Scanner scan = new Scanner(System.in);
        numObjects = scan.nextInt();

        //Create an array of numObjects with random assigned values in RANGE
        Subject[] subjects = new Subject[numObjects];
        for (int i = 0; i < numObjects; i++) {
            subjects[i] = new Subject();
        }
        // for (int i = 0; i < numObjects; i++) {
        //     subjects[i] = rand.nextInt(1, RANGE + 1);
        // }
        // System.out.println("Original array: " + Arrays.toString(subject));

        //Time how long it takes to sort the array
        long startTime = System.nanoTime();
        //Sort the array using the selectionsort method
        Subject.selectionSort(subjects);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Selection sort took " + (duration / 1.e6) + " milliseconds.");
        //System.out.println("Sorted array: " + Arrays.toString(subject));

        //Shuffle the array for the next test
        shuffle(subjects);
        //Sort the array using quickSort 
        startTime = System.nanoTime();
        Subject.quickSort(subjects);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick sort took " + (duration / 1.e6) + " milliseconds.");
        
        shuffle(subjects);
        //Use linear search to find the random value
        int randomValue = rand.nextInt(1, RANGE + 1);
        startTime = System.nanoTime();
        int index = Subject.linearSearch(subjects, randomValue);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Linear search took " + (duration / 1.e6) + " milliseconds.");
        System.out.println("Linear search found " + randomValue + " at index " + index);


        //Beginning of Binary Search
        //Sort the array using quickSort
        Subject.quickSort(subjects);
        //Use binary search to find the random value
        startTime = System.nanoTime();
        index = Subject.binarySearch(subjects, randomValue);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Binary search took " + (duration / 1.e6) + " milliseconds.");
        System.out.println("Binary search found " + randomValue + " at index " + index);
    }

    // Add a static method to shuffle the array
    public static void shuffle(Subject[] subjects) {
        // Loop over all the elements in the array
        for (int i = 0; i < subjects.length; i++) {
            // Generate a random index between 0 and array.length - 1
            int randomIndex = (int) (Math.random() * subjects.length);
            // Swap the current element with the random element
            swap(subjects, i, randomIndex);
        }
    }

    //Add a static method to swap two elements in an array
    public static void swap(Subject[] subjects, int i, int j) {
        Subject temp = subjects[i];
        subjects[i] = subjects[j];
        subjects[j] = temp;
    }

}
