
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
		return "42";
	}

	// Given a tree, returns longest string from that tree
	private String longest(TreeNode node) {
		String res1 = longest(node.left);
		String res2 = longest(node.right);
		// Other one is node.data

		if (res2.length() > res1.length() && res2.length() > node.data.length()) {
			return res2;
		}
		else if (res1.length() > res2.length() && res1.length() > node.data.length()) {
			return res1;
		}
		else if (node.data.length() > res2.length() && node.data.length() > res1.length()) {
			return node.data;
		} else {
			return null;// I don't have time for this
		}
		
	}
}