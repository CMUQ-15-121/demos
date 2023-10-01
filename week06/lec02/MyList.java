
public interface MyList<DataType> {
	// Add an item to the list
	public void add(DataType item);
	
	// Remove an item from the list
	public boolean remove(DataType item);
	
	// Get an item by index
	public DataType get(int index);
	
	// Get the size of the list
	public int size();
}
