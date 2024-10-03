package org.education;

/**
 * A max heap priority queue that stores House instances.
 * Implements the PriorityQueue interface using an array-based heap.
 */
public class PriorityQueueHeap implements PriorityQueue {
    private House[] heap; // Array to store the heap
    private int size;     // Number of elements in the heap

    /**
     * Default constructor that initializes the heap with a default capacity of 10.
     */
    public PriorityQueueHeap() {
        heap = new House[10]; // initial capacity
        size = 0;
    }

    /**
     * Copy constructor that creates a deep copy of the given PriorityQueueHeap.
     *
     * @param other the PriorityQueueHeap to copy
     */
    public PriorityQueueHeap(PriorityQueueHeap other) {
        this.heap = new House[other.heap.length];
        this.size = other.size;
        for (int i = 0; i < size; i++) {
            this.heap[i] = new House(other.heap[i]); // deep copy of House instances
        }
    }

    /**
     * Adds a House to the heap and maintains the max heap property.
     *
     * @param house the House object to add
     */
    @Override
    public void add(House house) {
        if (size >= heap.length) {
            resizeHeap();
        }
        heap[size] = house;
        size++;
        heapifyUp(size - 1);
    }

    /**
     * Removes and returns the most expensive house from the heap (the root).
     *
     * @return the House with the maximum value, or null if the heap is empty
     */
    @Override
    public House getMostExpensive() {
        if (isEmpty()) {
            return null;
        }
        House mostExpensive = heap[0];
        heap[0] = heap[size - 1]; // Move last element to root
        size--;
        heapifyDown(0);
        return mostExpensive;
    }

    /**
     * Clears the heap by resetting the size and reinitializing the heap array.
     */
    @Override
    public void clear() {
        heap = new House[10]; // reset with initial capacity
        size = 0;
    }

    /**
     * Returns the current size of the heap.
     *
     * @return the number of elements in the heap
     */
    @Override
    public int getLength() {
        return size;
    }

    /**
     * Checks whether the heap is empty.
     *
     * @return true if the heap is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Creates and returns a deep copy of the current PriorityQueueHeap instance.
     *
     * @return a new PriorityQueueHeap that is a deep copy of the current heap
     */
    public PriorityQueueHeap deepCopy() {
        return new PriorityQueueHeap(this);
    }

    /**
     * Resizes the heap when the array is full by doubling its capacity.
     */
    private void resizeHeap() {
        House[] newHeap = new House[heap.length * 2];
        System.arraycopy(heap, 0, newHeap, 0, size);
        heap = newHeap;
    }

    /**
     * Maintains the max heap property by moving the element at the given index up the tree.
     *
     * @param index the index of the element to heapify up
     */
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)].getValue() < heap[index].getValue()) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    /**
     * Maintains the max heap property by moving the element at the given index down the tree.
     *
     * @param index the index of the element to heapify down
     */
    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left].getValue() > heap[largest].getValue()) {
            largest = left;
        }

        if (right < size && heap[right].getValue() > heap[largest].getValue()) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    /**
     * Helper method to get the index of the parent node.
     *
     * @param index the index of the current node
     * @return the index of the parent node
     */
    private int parent(int index) {
        return (index - 1) / 2;
    }

    /**
     * Helper method to get the index of the left child.
     *
     * @param index the index of the current node
     * @return the index of the left child
     */
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    /**
     * Helper method to get the index of the right child.
     *
     * @param index the index of the current node
     * @return the index of the right child
     */
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    /**
     * Helper method to swap two elements in the heap.
     *
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(int i, int j) {
        House temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}