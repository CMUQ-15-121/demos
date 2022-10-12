
public class BSTString {

	private class TreeNode {
		String data;
		TreeNode left;
		TreeNode right;

		public TreeNode(String item) {
			this.data = item;
			this.left = null;
			this.right = null;
		}
	}

	private TreeNode root;

	public BSTString() {
		this.root = null;
	}

	public void add(String item) {
		this.root = add(this.root, item);
	}

	private TreeNode add(TreeNode node, String item) {
		if (node == null) {
			return new TreeNode(item);
		}
		int res = item.compareTo(node.data);
		if (res < 0) {
			node.left = add(node.left, item);
		} else if (res >= 0) {
			node.right = add(node.right, item);
		}
		return node;
	}

	/**
	 * Get the longest string stored in the tree
	 * 
	 * @return The longest string in the tree
	 */
	public String longest() {
		return longest(this.root);
	}

	// Given a tree, returns longest string from that tree
	private String longest(TreeNode node) {
		String res1 = longest(node.left);
		String res2 = longest(node.right);

		// Here is a nice trick to find the longest item from res1, res2, and node.data
		String biggest = res1;
		if (res2.length() > biggest.length()) {
			biggest = res2;
		}
		if (node.data.length() > biggest.length()) {
			biggest = node.data;
		}
		return biggest;		
	}
}