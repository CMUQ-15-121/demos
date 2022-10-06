
public class TreeTester {

	public static void main(String[] args) {
		int[] initial_nodes = {14, 10, 20, 8, 12, 16, 21, 15};
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

		for (int e: initial_nodes) {
			bst.add(e);
		}
		
		System.out.println(bst);
		
		bst.printNodesInOrder();
	}

}
