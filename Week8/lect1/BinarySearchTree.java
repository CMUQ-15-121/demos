package lect1;

public class BinarySearchTree<DataType extends Comparable>{


	private TreeNode<DataType> root;
	
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	/**
	 * Checks if the BST is empty
	 * 	  
	 * @return true if the tree is empty and false otherwise
	 */
	public boolean isEmpty() {
	
		return this.root == null;
	}
	
	/**
	 * Add item to the tree in its correct location.
	 * 
	 * Technique 1: Use a loop
	 * 
	 * @param item The item to add to the tree
	 */
//	public void add(DataType item) {
//		
//		//special case
//		if(this.isEmpty()) {
//			this.root = new TreeNode(item);
//		}
//		
//		//general case
//		TreeNode n = this.root;
//		
//		while(true) {
//			
//			int res = item.compareTo(n.data);
//			
//			if(res < 0) {
//				if(n.left == null) {
//					n.left = new TreeNode(item);
//					return;
//				}
//				
//				n = n.left;
//			}else if(res > 0) {
//				
//				if(n.right == null) {
//					n.right = new TreeNode(item);
//					return;
//				}
//				
//				n = n.right;
//				
//			}else {
//				return;
//			}
//			
//			
//			
//			
//		}
//
//	}
	
	
	/**
	 * Add item to the tree in its correct location.
	 * 
	 * Technique 2: Recursive
	 * 
	 * @param item The item to add to the tree
	 */
	public void add(DataType item) {
		
		this.root = add(this.root, item);
	}
	
	
	private TreeNode<DataType>  add(TreeNode<DataType>  n, DataType item) {
		
		if(n == null) {
			return new TreeNode(item);
		}
		
		int res = item.compareTo(n.data);
		
		if(res < 0) {
			n.left = add(n.left, item);
			
		}else {
			n.right = add(n.right, item);
		}
		
		return n;
	}
	
	
	/**
	 * Determine if an item is in the tree.
	 * 
	 * @param item The item to look for in the tree
	 * @return true if the item is in the tree and false otherwise
	 */
//	public boolean contains(DataType item) {
//		
//		//special case
//		if(this.isEmpty()) {
//			return false;
//		}
//		
//		//general case
//		TreeNode n = this.root;
//		
//		while(true) {
//			
//			int res = item.compareTo(n.data);
//			
//			if(res < 0) {
//				if(n.left == null) {
//					return false;
//				}
//				
//				n = n.left;
//				
//			}else if(res > 0) {
//				
//				if(n.right == null) {
//					return false;
//				}
//				
//				n = n.right;
//				
//			}else { //equal
//				return true;
//			}
//			
//			
//			
//			
//		}
//	}

	
	/**
	 * Determine if an item is in the tree.
	 * 
	 * More efficient approach
	 * 
	 * @param item The item to look for in the tree
	 * @return true if the item is in the tree and false otherwise
	 */
	public boolean contains(DataType item) {
		
		//special case
		if(this.isEmpty()) {
			return false;
		}
		
		//general case
		TreeNode<DataType>  n = this.root;
		
		while(n != null) {
			
			int res = item.compareTo(n.data);
			
			if(res < 0) {
				n = n.left;
				
			}else if(res > 0) {
				
				n = n.right;
				
			}else { //equal
				return true;
			}
		}
		
		return false;
	}


	/***********************
	 * 
	 * In-Order Traversal
	 * 
	 */
	public void printNodesInOrder() {
		printNodesInOrder(this.root);
	}
	
	private void printNodesInOrder(TreeNode<DataType>  node) {
		
		//BC 
		if(node == null)
			return;
		
		//Recursive 
		printNodesInOrder(node.left);
		System.out.println(node); //Between
		printNodesInOrder(node.right);
	}
	
	
	/***********************
	 * 
	 * Pre-Order Traversal
	 * 
	 */
	public void printNodesPreOrder() {
		printNodesPreOrder(this.root);
	}
	
	public void printNodesPreOrder(TreeNode<DataType>  node) {
		
		//BC 
		if(node == null) {
			return;
		}
		
		//Recursive 
		System.out.println(node); //before
		printNodesPreOrder(node.left);
		printNodesPreOrder(node.right);
		
	}
	
	
	/***********************
	 * 
	 * Post-Order Traversal
	 * 
	 */
	public void printNodesPostOrder() {
		printNodesPostOrder(this.root);
	}
	
	public void printNodesPostOrder(TreeNode<DataType>  node) {
			
		//BC 
		if(node == null)
			return;
		
		//Recursive 
		printNodesPostOrder(node.left);
		printNodesPostOrder(node.right);
		System.out.println(node); //after

		
	}
	
	/*********************************************
	 * toString
	 * 
	 * @return String representation for the tree
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, this.root, 0);
		return sb.toString();
	}

	// @formatter:off
	/*
	 * Q's:
     * - What is a StringBuilder?
     * - What type (in, pre, post) of recursive traversal is this?
     * - What is the base case doing?
     * - What is the depth argument for?
     * - What is the "self" part of the recursive case doing?
     */
    // @formatter:on
	private void toString(StringBuilder sb, TreeNode<DataType>  node, int depth) {
		//BC
		if (node == null) {
			for (int i = 0; i < depth; i++) {
				sb.append("\t");
			}
			sb.append("-\n");
			return;
		}

		//RC: right
		toString(sb, node.right, depth + 1);
		
		//Node processed in between (in-order)
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		sb.append(node.data);
		sb.append("\n");
		
		//RC: left
		toString(sb, node.left, depth + 1);
	}
	
	
	
	/*************************************
	 * remove
	 * 
	 * @param item The item to be removed
	 */
	public void remove(DataType item) {
		this.root = remove(this.root, item); // Re-root after possible change at top
	}
	
	
	/*
	 * Q: Why is this a useful helper function for remove?
	 */
	private DataType findSuccessor(TreeNode<DataType> node) {
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
	private TreeNode<DataType> remove(TreeNode<DataType>  node, DataType item) {
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
	
	
	
	/*** MAIN ******************************************************************
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		int[] nums = { 14, 10, 20, 12, 8, 16, 21, 15, 13, 11 };
		for (int n : nums) {
			System.out.println("Adding node " + n);
			myTree.add(n);
		}
		System.out.println(myTree); //toString

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
	
} //class end
