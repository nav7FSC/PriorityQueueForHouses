# House Priority Queue and Heapsort

## Project Overview

The **House Priority Queue and Heapsort** project implements a heap-based priority queue and a heapsort algorithm specifically designed to manage and sort a collection of house data. The program reads house information from a file, organizes the houses based on their values using a max heap, and demonstrates the functionality of priority queues in Java.

## Features

- **Heap-based Priority Queue**:
    - Custom implementation of a priority queue using an array-based max heap to efficiently store `House` instances.

- **Heapsort Algorithm**:
    - Sorts an array of `House` objects by their values in descending order using the heapsort algorithm.

- **Deep Copy Functionality**:
    - Implements methods for creating deep copies of the priority queue, ensuring data integrity during operations.

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