public class BST {
    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int data) {
            this.data = data;
        }
    }

    public BST() {
        root = null;
    }

    public void add(int item) {
        root = add(root, item);
    }
    
    public int smallest() {
    	if (root == null) {
    		return -1;
    	}
    	TreeNode tmp = root;
    	while (tmp.left != null) {
    		tmp = tmp.left;
    	}
    	return tmp.data;
    }
    
    public int largestEven() {
    	return largestEvenHelper(root);
    }
    
    private int largestEvenHelper(TreeNode t) {
    	if (t == null) {
    		return -1;
    	}
    	
    	int left = largestEvenHelper(t.left);
    	int right = largestEvenHelper(t.right);
    	
    	int self;
    	if (t.data % 2 == 0) {
    		self = t.data;
    	} else {
    		self = -1;
    	}
    	
    	int ret = self;
    	
    	if (ret < left) {
    		ret = left;
    	}
    	
    	if (ret < right) {
    		ret = right;
    	}
    	
    	return ret;
    }

    private TreeNode add(TreeNode root, int item) {
        if (root == null) {
            return new TreeNode(item);
        }

        if (item < root.data) {
            root.left = add(root.left, item);
        } else {
            root.right = add(root.right, item);
        }

        return root;
    }
}