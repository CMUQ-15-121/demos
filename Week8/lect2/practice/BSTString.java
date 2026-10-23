package Lect2.practice;

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
		return longest(this.root); 
	}

	private String longest(TreeNode node) {
		if(node == null)
			return "";
		
		String ll= longest(node.left);
		String rl =  longest(node.right);
		
		
		return longestString(node.data, ll, rl); 
	}
	
	public String longestString(String s1, String s2, String s3) {
		String longest = s1;
		
		if(s2.length()>longest.length()) {
			longest = s2;
		}
		
		if(s3.length() > longest.length()) {
			longest = s3;
		}
		
		return longest;
		
	}
	
	public static void main(String[] args) {
		BSTString tree = new BSTString();
		
		
		String[] words = {
			    "apple",
			    "banana",
			    "grapefruit",
			    "kiwi",
			    "strawberry",
			    "blueberry",
			    "mango",
			    "pineapple",
			    "plum"
			};
		for (String w: words) {
			tree.add(w);
		}
		
		System.out.println("Longest: " + tree.longest());
	}
}