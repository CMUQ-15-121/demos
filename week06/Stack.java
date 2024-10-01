public interface Stack<DataType> {
    // Return true if the stack is empty, false otherwise
    public boolean isEmpty();

    // Put a new item on top of the stack
    public void push(DataType value);

    // Remove the top item from the top of the stack and return it
    public DataType pop();

    // Return the top item from the stack, but don't remove it from the stack
    public DataType peek();
}