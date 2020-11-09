
public class BinarySearchTree<DataType extends Comparable<DataType>> {
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

	public void clear() {
		this.root = null;
	}

	public void add(DataType item) {
		if (this.root == null) {
			this.root = new TreeNode(item);
			return;
		}
		add(root, item);
	}

	private void add(TreeNode node, DataType item) {
		// Where is our base case?
		int res = item.compareTo(node.data);
		if (res < 0) {
			// Go left
			if (node.left == null) {
				node.left = new TreeNode(item);
				return;
			}
			add(node.left, item);
		} else if (res > 0) {
			// Go right
			if (node.right == null) {
				node.right = new TreeNode(item);
				return;
			}
			add(node.right, item);
		} else {
			throw new IllegalStateException("Duplicate value in tree: " + item);
		}
	}

	public boolean contains(DataType item) {
		TreeNode tmp = this.root;
		while (tmp != null) {
			int res = item.compareTo(tmp.data);
			if (res < 0) {
				tmp = tmp.left;
			} else if (res > 0) {
				tmp = tmp.right;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public void printInOrder() {
		printInOrderHelper(this.root);
	}
	
	private void printInOrderHelper(TreeNode node) {
		if (node == null) {
			return;
		}
		printInOrderHelper(node.left);
		System.out.println(node.data);
		printInOrderHelper(node.right);
	}
	
	public void printPreOrder() {
		printPreOrderHelper(this.root);
	}
	
	private void printPreOrderHelper(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		printPreOrderHelper(node.left);
		printPreOrderHelper(node.right);	
	}
	
	public void printPostOrder() {
		printPostOrderHelper(this.root);
	}
	
	private void printPostOrderHelper(TreeNode node) {
		if (node == null) {
			return;
		}
		printPostOrderHelper(node.left);
		printPostOrderHelper(node.right);
		System.out.println(node.data);
	}	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, this.root, 0);
		return sb.toString();

	}

	private void toString(StringBuilder sb, TreeNode node, int depth) {
		if (node == null) {
			for (int i = 0; i < depth; i++) {
				sb.append("\t");
			}
			sb.append("-\n");
			return;
		}

		toString(sb, node.right, depth + 1);

		// Put self in string, use sb.append()
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		sb.append(node.data);
		sb.append("\n");

		toString(sb, node.left, depth + 1);
	}
}
