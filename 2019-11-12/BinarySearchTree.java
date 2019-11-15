
public class BinarySearchTree<DataType extends Comparable<DataType>> {

	TreeNode root;

	public class TreeNode {
		DataType data;
		TreeNode left;
		TreeNode right;

		public TreeNode(DataType item) {
			this.data = item;
		}
	}

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public void add(DataType item) {
		root = add(root, item);
	}
	
	private TreeNode add(TreeNode node, DataType item) {
		if (node == null) {
			return new TreeNode(item);
		}
		
		int res = node.data.compareTo(item);
		if (res < 0) {
			node.right = add(node.right, item);
		}
		else if (res > 0) {
			node.left = add(node.left, item);
		}
		else {
			throw new IllegalStateException("Duplicate value in tree " + item);
		}
		
		return node;
	}
	
	public void remove(DataType item) {
		root = remove(root, item);
	}
	
	private DataType findLeftMost(TreeNode node) {
		if (node.left == null) {
			return node.data;
		}
		else {
			return findLeftMost(node.left);
		}
	}
	
	private TreeNode remove(TreeNode node, DataType item) {
		
		if (node == null) {
			return null;
		}
		
		int res = node.data.compareTo(item);

		if (res == 0) { // This is the node I want to remove
			// Node has no children
			if (node.left == null && node.right == null) {
				return null;
			}
			
			// Node has one child (left)
			if (node.right == null && node.left != null) {
				return node.left;
			}
			
			// Node has one child (right)
			if (node.left == null && node.right != null) {
				return node.right;
			}
			
			// Node has two children (crap)
			DataType succ = findLeftMost(node.right);
			node.right = remove(node.right, succ);
			node.data = succ;
			
		} else if (res < 0) { // The node I want to remove is to the left
			node.right = remove(node.right, item);
		} else if (res > 0) { // The node I want to remove is to the right
			node.left = remove(node.left, item);
		}
		
		return node;
	}

	public boolean contains(DataType item) {
		if (isEmpty()) {
			return false;
		}

		TreeNode tmp = root;
		while (tmp != null) {
			int res = tmp.data.compareTo(item);
			if (res < 0) {
				tmp = tmp.right;
			} else if (res > 0) {
				tmp = tmp.left;
			} else {
				return true;
			}
		}

		return false;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, root, 0);
		return sb.toString();

	}

	private void toString(StringBuilder sb, TreeNode root, int depth) {
		if (root == null) {
			for (int i = 0; i < depth; i++) {
				sb.append("\t");
			}
			sb.append("-\n");
			return;
		}

		toString(sb, root.right, depth + 1);

		// Put self in string, use sb.append()
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		sb.append(root.data);
		sb.append("\n");

		toString(sb, root.left, depth + 1);
	}

	public void printInOrder() {
		printInOrder(root);
	}

	private void printInOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		printInOrder(node.left);
		System.out.println(node.data);
		printInOrder(node.right);
	}

	public void printPreOrder() {
		printPreOrder(root);
	}

	private void printPreOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	public void printPostOrder() {
		printPostOrder(root);
	}

	private void printPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data);
	}
}
