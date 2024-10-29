public class BinarySearchTree<DataType extends Comparable<DataType>> {

	private class TreeNode {
		private DataType data;
		private TreeNode left;
		private TreeNode right;

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

//	// Very nice iterative approach
//	public void add(DataType item) {
//		// Special case:
//		if (this.root == null) {
//			this.root = new TreeNode(item);
//			return;
//		}
//
//		// General case:
//		TreeNode t = this.root;
//		while (true) {
//			if (item.compareTo(t.data) < 0) {
//				if (t.left == null) {
//					t.left = new TreeNode(item);
//					return;
//				}
//				t = t.left;
//			} else {
//				if (t.right == null) {
//					t.right = new TreeNode(item);
//					return;
//				}
//				t = t.right;
//			}
//		}
//	}

//	public void add(DataType item) {
//		if (this.root == null) {
//			this.root = new TreeNode(item);
//			return;
//		}
//		add(this.root, item);
//	}
//	
	// Recursive approach 1
//	private void add(TreeNode node, DataType item) {
//		int res = item.compareTo(node.data);
//		if (res < 0) {
//			if (node.left == null) {
//				node.left = new TreeNode(item);
//				return;
//			}
//			add(node.left, item);
//		} else {
//			if (node.right == null) {
//				node.right = new TreeNode(item);
//				return;
//			}
//			add(node.right, item);
//		}
//	}

	public void add(DataType item) {
		this.root = add(this.root, item);
	}

	// Recursive approach 2
	public TreeNode add(TreeNode node, DataType item) {
		if (node == null) {
			return new TreeNode(item);
		}

		int res = item.compareTo(node.data);
		if (res < 0) {
			node.left = add(node.left, item);
		} else {
			node.right = add(node.right, item);
		}
		return node;
	}

	/**
	 * Determine if an item is in the tree.
	 * 
	 * @param item The item to look for in the tree
	 * @return true if the item is in the tree and false otherwise
	 */
	public boolean contains(DataType item) {
		TreeNode t = this.root;
		while (t != null) {
			if (item.compareTo(t.data) < 0) {
				t = t.left;
			} else if (item.compareTo(t.data) > 0) {
				t = t.right;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public void remove(DataType item) {
		this.root = remove(this.root, item);
	}

	/*
	 * Q: Why is this a useful helper function for remove?
	 */
	private DataType findSuccessor(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}

	// @formatter:off
	/*
	 * Q's: 
     * - For the line `node.left = remove(node.left,item)`...
     *    - What does our recursive function return?
     *    - Why does it return that?
     * - What would be good	comments for each of the cases (2a, 2b, 3) below?
     * - For case 1, why does `return null` result in the node being removed?
     * - For case 2a, why does returning node.left result in the node being removed?
     * - For case 2b, why does returning node.right result in the node being removed?
     * - For case 3...
     *    - Why is case 3 more complicated than the other cases?
     *    - What is findSuccessor doing here?
     *    - Why do we have a recursive remove call in this case?
     * - At the end of the method, why do we `return node`?
     */
     // @formatter:on
	private TreeNode remove(TreeNode node, DataType item) {
		if (node == null) {
			return null;
		}
		int res = item.compareTo(node.data);
		if (res < 0) {
			// The node to remove is on our left
			node.left = remove(node.left, item);
		} else if (res > 0) {
			// The node to remove is on our right
			node.right = remove(node.right, item);
		} else {
			// `node` is the node to remove

			// Case 1: The node has no children
			if (node.left == null && node.right == null) {
				return null; // Removes this node
			}
			// Case 2a: One child on the left
			else if (node.left != null && node.right == null) {
				return node.left;
			}
			// Case 2b: One child on the right
			else if (node.left == null && node.right != null) {
				return node.right;
			}
			// Case 3: Two children
			else {
				DataType succ = findSuccessor(node.right);
				node.right = remove(node.right, succ);
				node.data = succ;
				return node;
			}
		}
		return node;
	}

	public void printNodesInOrder() {
		printNodesInOrder(this.root);
	}
	
	public void printNodesInOrder(TreeNode node) {
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
	
	public void printNodesPreOrder(TreeNode node) {
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
	
	public void printNodesPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		printNodesPostOrder(node.left);
		printNodesPostOrder(node.right);
		System.out.println(node);
	}
	
	// @formatter:off
	/*
	 * Q's to ask:
     * - What is a StringBuilder?
     * - What type (in, pre, post) of recursive traversal is this?
     * - What is the base case doing?
     * - What is the depth argument for?
     * - What is the "self" part of the recursive case doing?
     */
    // @formatter:on
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

	public static void main(String[] args) {
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		int[] nums = { 14, 10, 20, 12, 8, 16, 21, 15, 13, 11 };
		for (int n : nums) {
			System.out.println("Adding node " + n);
			myTree.add(n);
		}
		System.out.println(myTree);

		System.out.println(myTree.contains(14));
		System.out.println(myTree.contains(15));
		System.out.println(myTree.contains(12));
		System.out.println(myTree.contains(22));
		System.out.println(myTree.contains(7));
		
		System.out.println("---");
		myTree.printNodesInOrder();
		
		System.out.println("---");
		myTree.printNodesPreOrder();
		
		System.out.println("---");
		myTree.printNodesPostOrder();
	}
}
