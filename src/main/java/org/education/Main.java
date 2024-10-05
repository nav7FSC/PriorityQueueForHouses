package org.education;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The Main class demonstrates the functionality of heapsort
 * and the PriorityQueueHeap class. It reads house data from
 * a file, sorts it, and showcases priority queue features.
 */
public class Main {

    /**
     * Entry point of the program. Reads house data, sorts it using heapsort,
     * and demonstrates the PriorityQueueHeap functionality.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        House[] houses = readHousesFromFile();

        if (houses != null) {
            // Display houses before sorting
            System.out.println("Before sorting:");
            printHouses(houses);

            // Sort houses using heapsort
            heapsort(houses);

            System.out.println("----------------------------");

            // Display houses after sorting
            System.out.println("After sorting (Highest to Lowest):");
            printHouses(houses);

            // Demonstrate copy constructor and deep copy
            PriorityQueueHeap pq = new PriorityQueueHeap();
            for (House house : houses) {
                pq.add(house);
            }

            // Create copied and deep copied priority queues
            PriorityQueueHeap copiedPq = new PriorityQueueHeap(pq);
            PriorityQueueHeap deepCopiedPq = pq.deepCopy();

            System.out.println("----------------------------");

            // Display lengths of the priority queues
            System.out.println("Original PQ length: " + pq.getLength());
            System.out.println("Copied PQ length: " + copiedPq.getLength());
            System.out.println("Deep copied PQ length: " + deepCopiedPq.getLength());
        }
    }

    /**
     * Reads houses from the input file "houses.txt".
     *
     * @return an array of House objects, or null if the file is not found
     */
    private static House[] readHousesFromFile() {
        try {
            Scanner scanner = new Scanner(new File("houses.txt"));
            int count = 1000; // Expected number of houses
            House[] houses = new House[count];
            int i = 0;

            // Read owner and value pairs
            while (scanner.hasNextLine() && i < count) {
                String owner = scanner.nextLine();
                int value = Integer.parseInt(scanner.nextLine());
                houses[i++] = new House(owner, value);
            }

            scanner.close();
            return houses; // Return the array of House objects

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + "houses.txt");
            return null; // Return null if the file is not found
        }
    }

    /**
     * Sorts an array of House instances by their value using heapsort.
     *
     * @param a the array of House objects to sort in descending order
     */
    public static void heapsort(House[] a) {
        PriorityQueueHeap heap = new PriorityQueueHeap();

        // Build the heap
        for (House house : a) {
            heap.add(house);
        }

        // Extract elements from the heap in sorted order (max to min)
        for (int i = 0; i < a.length; i++) {
            a[i] = heap.getMostExpensive();
        }
    }

    /**
     * Prints the details of an array of House objects.
     *
     * @param houses the array of houses to print
     */
    private static void printHouses(House[] houses) {
        for (House house : houses) {
            System.out.println(house);
        }
    }
}