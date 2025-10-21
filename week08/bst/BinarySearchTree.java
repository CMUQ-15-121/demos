package bst;

public class BinarySearchTree<DataType extends Comparable>{


	private TreeNode root;
	
	
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
	
	
	
	public void add(DataType item) {
		
		this.root = add(this.root, item);
	}
	
	
	public TreeNode add(TreeNode n, DataType item) {
		
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

	
	public boolean contains(DataType item) {
		
		//special case
		if(this.isEmpty()) {
			return false;
		}
		
		//general case
		TreeNode n = this.root;
		
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
	 * toString()
	 ***********************/
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
	
	

	
	
} //class end
