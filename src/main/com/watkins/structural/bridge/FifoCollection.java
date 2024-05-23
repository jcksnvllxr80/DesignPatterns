package main.com.watkins.structural.bridge;

// this is the abstraction
public interface FifoCollection<T> {
    // adds element to collection
    void offer(T element);

    // removes and returns first element from collection
    T poll();
}
