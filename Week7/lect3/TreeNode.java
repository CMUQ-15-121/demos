package lect3;

public class TreeNode<DataType> {
	
	private DataType data;
	public TreeNode left;
	public TreeNode right;


	public TreeNode(DataType item) {

		this.data = item;
		this.left = null;
		this.right = null;
	}

	public DataType getData() {
		return this.data;
	}
	
	public String toString() {
		return ""+this.data.toString();
	}
}
