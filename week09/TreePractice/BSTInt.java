import java.util.NoSuchElementException;

public class BSTInt {

	private class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int item) {
			this.data = item;
			this.left = null;
			this.right = null;
		}
	}

	private TreeNode root;

	public BSTInt() {
		this.root = null;
	}

	public void add(int item) {
		this.root = add(this.root, item);
	}

	private TreeNode add(TreeNode node, int item) {
		if (node == null) {
			return new TreeNode(item);
		}
		if (item < node.data) {
			node.left = add(node.left, item);
		} else if (item >= 0) {
			node.right = add(node.right, item);
		}
		return node;
	}
	


	
	/**
	 * Get the largest integer stored in the tree
	 * 
	 * @return The largest integer in the tree
	 */
	public int max() {
		TreeNode tmp = this.root;
		if (tmp == null) {
			throw new NoSuchElementException("Tree has no nodes");
		}
		while(tmp.right != null) {
			tmp = tmp.right;
		}
		return tmp.data;
	}

	
	/**
	 * Get the sum of all the nodes in the tree
	 * 
	 * @return the sum of all nodes in the tree
	 */
	public int sum() {
		return sum(this.root);
	}
	
	private int sum(TreeNode node) {
		if (node == null) {
			return 0;
		}
		
		int left = sum(node.left);
		int right = sum(node.right);
		return node.data + left + right;
	}
	
	public static void main(String[] args) {
		BSTInt tree = new BSTInt();
		
		//System.out.println("Max: " + tree.max());
		
		int nums[] = {14, 10, 20, 12, 8, 16, 21, 15, 13, 11};
		for (int n: nums) {
			tree.add(n);
		}
		
		System.out.println("Max: " + tree.max());
		System.out.println("Sum: " + tree.sum());
	}
}
