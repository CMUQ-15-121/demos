
public class ListNode<DataType> {
	DataType data;
	ListNode<DataType> next;
	
	public ListNode(DataType data) {
		this.data = data;
	}
	
	public String toString() {
		return data.toString();
	}
}
