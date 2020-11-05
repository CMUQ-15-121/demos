
public class BinarySearchTree<DataType> {
	private TreeNode root;
	
	private class TreeNode {
		DataType data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(DataType item) {
			this.data = item;
		}
	}
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void add(DataType item) {
		if (this.root == null) {
			this.root = new TreeNode(item);
			return;
		}
		
	}
	
	private void add(TreeNode node, DataType item) {
		// Where is our base case?
		
		int res = item.compareTo(node.data);
		if (res < 0) {
			add(node.left, item);
		}
		else if (res > 0) {
			add(node.right, item);
		}
		else {
			throw new IllegalStateException("Duplicate value in tree: " + item);
		}
	}
}
