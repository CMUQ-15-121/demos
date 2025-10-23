package bst;

public class TreeTester {

	public static void main(String[] args) {
		//int[] initial_nodes = { 14, 10, 20, 8, 12, 16, 21, 15 };
		
		int[] initial_nodes = {8, 3, 1, 6, 10, 14}; //traversal example
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

		for(int n: initial_nodes) {
			bst.add(n);
		}
		
		System.out.println(bst);
		
		System.out.println(bst.contains(14));
		System.out.println(bst.contains(8));
		System.out.println(bst.contains(16));
		System.out.println(bst.contains(15));
		System.out.println(bst.contains(25));
		System.out.println(bst.contains(9));

		
		//bst.printNodesInOrder();
		//bst.printNodesPreOrder();
		bst.printNodesPostOrder();

	}

}
