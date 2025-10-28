package practice;

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
		
		//Base Case
		if(node == null)
			return "";
		
		//Recursive Case
		String longestL = longest(node.left);
		String longestR = longest(node.right);
		
		return longestString(node.data, longestL, longestR);
	}
	
	//helper method
	private String longestString(String s1, String s2, String s3) {
		String longest = s1;
		if (longest.length() < s2.length()) {
			longest = s2;
		}
		if (longest.length() < s3.length()) {
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