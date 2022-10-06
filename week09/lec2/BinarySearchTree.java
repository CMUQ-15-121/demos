
public class BinarySearchTree<DataType extends Comparable<DataType>> {
	// What is a private class?
	private class TreeNode {
		DataType data;
		TreeNode left;
		TreeNode right;

		public TreeNode(DataType item) {
			this.data = item;
			this.left = null;
			this.right = null;
		}
		
		public String toString() {
			return this.data.toString();
		}
	}

	private TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public void add(DataType item) {
		this.root = add(this.root, item);
	}

	private TreeNode add(TreeNode node, DataType item) {
		if (node == null) {
			return new TreeNode(item);
		}
		int res = item.compareTo(node.data);
		if (res < 0) {
			// Going left
			node.left = add(node.left, item);
		} else if (res >= 0) {
			// Going right
			node.right = add(node.right, item);
		}
		// I didn't modify the item @node, so I just return it
		return node;
	}

//	public void add(DataType item) {
//		if (this.root == null) {
//			this.root = new TreeNode(item);
//		} else {
//			add(this.root, item);
//		}
//	}

//	private void add(TreeNode node, DataType item) {
//		if (item.compareTo(node.data) > 0) {
//			// Going right...
//			if (node.right == null) {
//				node.right = new TreeNode(item);
//				return;
//			}
//			add(node.right, item);
//		} else {
//			// Going left...
//			if (node.left == null) {
//				node.left = new TreeNode(item);
//				return;
//			}
//			add(node.left, item);
//		}
//	}
	
	public void printNodesInOrder() {
		printNodesInOrder(this.root);
	}
	
	private void printNodesInOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		printNodesInOrder(node.left);
		System.out.println(node);
		printNodesInOrder(node.right);
	}

	public void printNodesPreOrder() {
		printNodesPreOrder(this.root);
	}
	
	private void printNodesPreOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node);
		printNodesPreOrder(node.left);
		printNodesPreOrder(node.right);
	}
	
	public void printNodesPostOrder() {
		printNodesPostOrder(this.root);
	}
	
	private void printNodesPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		printNodesPostOrder(node.left);
		printNodesPostOrder(node.right);
		System.out.println(node);
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
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		sb.append(node.data);
		sb.append("\n");
		toString(sb, node.left, depth + 1);
	}
}