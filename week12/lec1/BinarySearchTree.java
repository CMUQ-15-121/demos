
public class BinarySearchTree<DataType extends Comparable<DataType>> {
	private class TreeNode {
		DataType data;
		TreeNode left;
		TreeNode right;

		public TreeNode(DataType item) {
			this.data = item;
			this.left = null;
			this.right = null;
		}
	}

	private TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

//	/**
//	 * Add item to the tree in its correct location.
//	 * 
//	 * @param item The item to add to the tree
//	 */
//	public void add(DataType item) {
//		// Easy case: Tree is empty
//		if (this.root == null) {
//			this.root = new TreeNode(item);
//			return;
//		}
//		add(this.root, item);
//	}
//	
//	private void add(TreeNode node, DataType item) {
//		int res = item.compareTo(node.data);
//		if (res < 0) {
//			// Going left
//			if (node.left == null) {
//				System.out.println("Adding " + item + " as a left child of " + node.data);
//				node.left = new TreeNode(item);
//				return;
//			}
//			add(node.left, item);
//		} else if (res > 0) {
//			// Going right
//			if (node.right == null) {
//				System.out.println("Adding " + item + " as a right child of " + node.data);
//				node.right = new TreeNode(item);
//				return;
//			}
//			add(node.right, item);
//		}
//	}

	/**
	 * Add item to the tree in its correct location.
	 * 
	 * @param item The item to add to the tree
	 */
	public void add(DataType item) {
		this.root = add(this.root, item);
	}

	public TreeNode add(TreeNode node, DataType item) {
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

	public void printInOrder() {
		printInOrder(this.root);
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
		printPreOrder(this.root);
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
		printPostOrder(this.root);
	}

	private void printPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data);
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
	
	public void remove(DataType item) {
		this.root = remove(this.root, item);
	}

	private TreeNode remove(TreeNode node, DataType item) {
		if (node == null) {
			return null;
		}
		int res = item.compareTo(node.data);
		if (res < 0) {
			node.left = remove(node.left, item);
		} else if (res > 0) {
			node.right = remove(node.right, item);
		} else {
			// `node` is the node to remove
			
			// Case 1: node has no children
			if (node.left == null && node.right == null) {
				return null; // Removes this node
			}
			// Case 2a: Only a left node
			else if (node.left != null && node.right == null) {
				return node.left;
			}
			// Case 2b: Only a right node
			else if (node.left == null && node.right != null) {
				return node.right;
			}
			// Case 3: Node has two children
			else {
				DataType succ = findSuccessor(node.right);
				node.right = remove(node.right, succ);
				node.data = succ;
				return node;
			}
		}
		
		return node;
	}
	
	private DataType findSuccessor(TreeNode node) {
		while(node.left != null) {
			node = node.left;
		}
		return node.data;
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
