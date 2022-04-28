package Queue;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.remove(0);
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
