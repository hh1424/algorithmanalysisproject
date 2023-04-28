package edu.guilford;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Ask the user how many random objects they want to generate each run of the program
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random objects do you want to generate?");
        int numSubjects = scan.nextInt();
        //Generate the array of random objects
        Subject[] subjects = new Subject[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            subjects[i] = new Subject();
        }
        
        // //Generate an array of random objects
        // Subject[] subjects = new Subject[];

        // //Ask the user how many random objects they want to generate each run of the program
        // Scanner scan = new Scanner(System.in);
        // System.out.println("How many random objects do you want to generate?");
        // int numSubjects = scan.nextInt();
        // //Generate the random objects
        // for (int i = 0; i < numSubjects; i++) {
        //     subjects[i] = new Subject();
        // }

        //Time how long it takes to sort the array
        long startTime = System.nanoTime();
        Subject.selectionSort(subjects);

        
    }
}
