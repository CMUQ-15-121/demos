
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
//	 * Add an item to the tree
//	 * 
//	 * Technique 1: Non-recursive
//	 * 
//	 * @param item The item to add
//	 */
//	public void add(DataType item) {
//
//		// What if the tree is empty?
//		if (this.root == null) {
//			this.root = new TreeNode(item);
//			return;
//		}
//
//		// Common case: Tree is not empty
//		TreeNode node = this.root;
//		while (true) {
//			int res = item.compareTo(node.data);
//			if (res < 0) {
//				// Go left
//				if (node.left == null) {
//					node.left = new TreeNode(item);
//					return;
//				}
//				node = node.left;
//			} else if (res > 0) {
//				// Go right
//				if (node.right == null) {
//					node.right = new TreeNode(item);
//					return;
//				}
//				node = node.right;
//			} else {
//				return;
//			}
//		}
//
//	}

//	/**
//	 * Add an item to the tree
//	 * 
//	 * Technique 2: Recursively
//	 * 
//	 * @param item The item to add
//	 */
//	public void add(DataType item) {
//		if (this.root == null) {
//			this.root = new TreeNode(item);
//		} else {
//			add(root, item);
//		}
//	}
//
//	private void add(TreeNode node, DataType item) {
//		// Base Case: Is item going to be a child of node?
//		int res = item.compareTo(node.data);
//		if (res < 0 && node.left == null) {
//			// Going left, new node will be there
//			node.left = new TreeNode(item);
//			return;
//		} else if (res > 0 && node.right == null) {
//			// Going right, new node will be there
//			node.right = new TreeNode(item);
//			return;
//		}
//
//		// Recursive case
//		if (res < 0) {
//			add(node.left, item);
//		} else if (res > 0) {
//			add(node.right, item);
//		}
//	}
	
	/**
	 * Add an item to the tree
	 * 
	 * Technique 3: More Recursion
	 * 
	 * @param item The item to add
	 */
	public void add(DataType item) {
		this.root = add(root, item);
	}

	private TreeNode add(TreeNode node, DataType item) {
		// Base case
		if (node == null) {
			return new TreeNode(item);
		}
		
		// Recursive case
		int res = item.compareTo(node.data);
		if (res < 0) {
			// Go left
			node.left = add(node.left, item);
		} else if (res > 0) {
			// Go right
			node.right = add(node.right, item);
		}
		return node;
	}
	
	public boolean contains(DataType item) {
		TreeNode node = this.root;
		while(node != null) {
			int res = item.compareTo(node.data);
			if (res == 0) {
				return true;
			} else if (res < 0) {
				node = node.left;
			} else if (res > 0) {
				node = node.right;
			}
		}
		return false;
	}
	
	public void printAllNodes() {
		printAllNodes(this.root);
	}
	
	private void printAllNodes(TreeNode node) {
		if (node == null) {
			return;
		}
		printAllNodes(node.left);
		printAllNodes(node.right);
		System.out.println(node.data);
	}
	
	/*
	 * Q's to ask: 
	 * - What is a StringBuilder?
	 * - What type (in, pre, post) of recursive traversal is this? 
	 * - What is the base case doing? 
	 * - What is the depth argument for? 
	 * - What is the "self" part of the recursive case doing?
	 */
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

		// Go right
		toString(sb, node.right, depth + 1);
		// Handle self
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		sb.append(node.data);
		sb.append("\n");
		// Go left
		toString(sb, node.left, depth + 1);
	}

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree();
		int[] nums = {14,10,20,8,12,16,21,15};
		//int[] nums = {8,10,12,14,15,16,20,21};
		for(int n: nums) {
			tree.add(n);
		}

		System.out.println(tree);
		
		tree.printAllNodes();
		
	}

}
