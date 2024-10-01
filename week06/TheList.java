
public interface TheList<DataType> {
	public void add(DataType item);

	public boolean remove(DataType item);

	public DataType get(int index);

	public int size();
}
