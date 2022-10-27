package BSTQueueIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BinarySearchTree<DataType extends Comparable<DataType>> implements Iterable<DataType> {

	private class TreeNode {
		DataType data;
		TreeNode left;
		TreeNode right;

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

	public void add(DataType item) {
		this.root = add(this.root, item);
	}

	private TreeNode add(TreeNode node, DataType item) {
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

	public void printNodesInOrder() {
		printNodesInOrder(this.root);
	}

	private void printNodesInOrder(TreeNode node) {
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

	private void printNodesPreOrder(TreeNode node) {
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

	private void printNodesPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		printNodesPostOrder(node.left);
		printNodesPostOrder(node.right);
		System.out.println(node);
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

	/*
	 * Q: Why is this a useful helper function for remove?
	 */
	private DataType findSuccessor(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}

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

	private class TreeIterator implements Iterator<DataType> {

		LinkedList<TreeNode> s = new LinkedList<TreeNode>();

		public TreeIterator() {
			s.push(root);
		}

		@Override
		public boolean hasNext() {
			return (s.peek() != null);
		}

		@Override
		public DataType next() {
			if (hasNext()) {
				TreeNode top = s.remove();
				if (top.left != null) {
					s.add(top.left);
				}
				if (top.right != null) {
					s.add(top.right);
				}
				return top.data;
			} else {
				throw new NoSuchElementException();
			}
		}

	}

	@Override
	public Iterator<DataType> iterator() {
		return new TreeIterator();
	}

}