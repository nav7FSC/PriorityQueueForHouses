# House Priority Queue and Heapsort

## Project Overview

The **House Priority Queue and Heapsort** project implements a heap-based priority queue and a heapsort algorithm specifically designed to manage and sort a collection of house data. The program reads house information from a file, organizes the houses based on their values using a max heap, and demonstrates the functionality of priority queues in Java.

## Objectives

This project aims to:
1. Implement a custom priority queue using a max heap to manage house data.
2. Use heapsort to sort `House` objects by their values.
3. Practice object-oriented programming principles such as encapsulation, deep copying, and modular design.
4. Demonstrate file I/O operations in Java to read and process house data from an input file.

## Features

### 1. Heap-based Priority Queue

- A custom implementation of a priority queue using an array-based max heap.
- Supports operations such as:
  - Adding a new `House` object.
  - Retrieving and removing the most expensive house (max heap property).
  - Checking if the priority queue is empty or retrieving the current number of elements.

### 2. Heapsort Algorithm

- The `heapsort` method is implemented to sort an array of `House` objects by their value in descending order. The algorithm:
  1. Builds a max heap using the priority queue.
  2. Continuously removes the most expensive house and stores it in the array.
  3. Provides an efficient way to sort large amounts of data.

### 3. Deep Copy Functionality

- The project includes the implementation of both:
  - A **copy constructor** for creating a deep copy of the `PriorityQueueHeap`.
  - A `deepCopy()` method to ensure that a full, independent copy of the heap is made.

### 4. File I/O

- The project reads house data from an input file, `houses.txt`. The file contains alternating lines for house owners and their respective values.
- The program reads and processes this data, converting it into `House` objects and storing them in the priority queue for further operations.

## How to Use

1. **Prepare the Input File**:
  - Ensure that the file `houses.txt` is in the project directory and follows the required format:
    ```
    Owner 1
    Value 1
    Owner 2
    Value 2
    ...
    ```
  - Each house entry should have the owner's name on one line and the house value (as an integer) on the next line. The file should contain data for 1000 entries (500 houses).

2. **Run the Program**:
  - Open the project in your preferred Java IDE (e.g., IntelliJ IDEA).
  - Compile and run the program.

3. **Program Execution**:
  - The program will read the house data from `houses.txt`.
  - It will display the house data before sorting.
  - The houses will be sorted using heapsort and displayed again in sorted order (by descending value).
  - The program will also demonstrate the deep copy functionality of the `PriorityQueueHeap` by displaying the lengths of the original, copied, and deep copied priority queues.

## Requirements

- **Java Version**: Java 11 or higher
- **IDE**: Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)

## Example Output

    Before sorting:
    Owner 1 - $500000
    Owner 2 - $750000
    ...

    After sorting:
    Owner 2 - $750000
    Owner 1 - $500000
    ...

    Original PQ length: 1000
    Copied PQ length: 1000
    Deep copied PQ length: 1000

## Author

[nav7FSC on GitHub](https://github.com/nav7FSC)