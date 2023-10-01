
public interface Queue<DataType> {
    // Return true if the queue is empty
    public boolean isEmpty();

    // Put a new item onto the end of the queue
    public void enqueue(DataType value);

    // Remove an item from the head of the queue and return it
    public DataType dequeue();

    // Return the item from the head of the queue, but don't remove it from the queue
    public DataType peek();
}
