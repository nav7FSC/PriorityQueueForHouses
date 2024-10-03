package org.education;

/**
 * Interface for a priority queue of House objects.
 * Defines methods for adding, retrieving, and managing House objects in the queue.
 */
public interface PriorityQueue {

    /**
     * Adds a House object to the priority queue.
     *
     * @param house the House object to add
     */
    void add(House house);

    /**
     * Removes and returns the most expensive House (the maximum value) from the queue.
     *
     * @return the House with the highest value, or null if the queue is empty
     */
    House getMostExpensive();

    /**
     * Clears all the elements from the priority queue.
     */
    void clear();

    /**
     * Returns the number of elements in the priority queue.
     *
     * @return the number of elements in the queue
     */
    int getLength();

    /**
     * Checks if the priority queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();
}