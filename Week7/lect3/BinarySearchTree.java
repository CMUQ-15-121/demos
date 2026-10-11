package lect3;

public class BinarySearchTree<DataType extends Comparable> {

	
	private TreeNode root;
	
	
	public BinarySearchTree() {
		this.root= null;
	}
	
	
	public boolean isEmpty() {
		return this.root==null;
	}
	
	
/*	public void add(DataType item) {
		
		//special case
		if(this.isEmpty()) {
			this.root = new TreeNode(item);
		}
		
		//traverse
		TreeNode n = this.root;
		while(true) {
			
			//compare 
			int res = item.compareTo(n.getData());
			
			//go left
			if(res < 0) {
				
				if(n.left==null) {
					n.left= new TreeNode(item);
					return;
				}
				
				//else : traverse left
				n= n.left;
				
				
			//go left
			}else if(res > 0) {
				
				//attache
				if(n.right==null) {
					n.right= new TreeNode(item);
					return;
				}
				
				//else
				n= n.right;//traverse right
				
				
			}else {
				return;
			}			
			
		}
		
	}*/
	
	
	public void add(DataType item){
	    this.root = add(this.root, item);
	}
	 
	private TreeNode add(TreeNode n, DataType item){
	    if(n == null) {
	        return new TreeNode(item);
	    }
	    
		//compare 
		int res = item.compareTo(n.getData());
		
		//go left
		if(res < 0) {
			
		    n.left = add(n.left, item);

		}else if(res > 0) {
		    n.right = add(n.right, item);
		}
	    
	    
	    return n;
	}
	
	
	
public boolean contains(DataType item) {
	
	//special case
	if(this.isEmpty()) {
		return false;
	}
	
	//traverse
	TreeNode n = this.root;
	while(true) {
		
		//compare 
		int res = item.compareTo(n.getData());
		
		//go left
		if(res < 0) {
			
			//not found
			if(n.left==null) {
				return false;
			}
			
			//else : traverse left
			n= n.left;
			
			
		//go left
		}else if(res > 0) {
			
			//not found
			if(n.right==null) {
				return false;
			}
			
			//else
			n= n.right;//traverse right
			
			
		}else {//found equal key
			return true;
		}
		
	}
	
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
		sb.append(node.getData());
		sb.append("\n");
		toString(sb, node.left, depth + 1);
	}
}
