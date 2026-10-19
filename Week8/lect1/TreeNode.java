package lect1;

public class TreeNode<DataType> {
	
	DataType data;
	TreeNode<DataType> left;
	TreeNode<DataType> right;

	public TreeNode(DataType item) {
		
		this.data = item;
		this.left = null;
		this.right = null;
	}

	public String toString() {
		return this.data.toString();
	}
}
