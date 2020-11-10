
public class TreeTester {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		// The following won't work because Person doesn't implement Comparable
		// BinarySearchTree<Person> otherBST = new BinarySearchTree<Person>();
		
		System.out.println(bst.contains(16));
		
		bst.add(14);
		bst.add(10);
		bst.add(20);
		bst.add(8);
		bst.add(12);
		bst.add(16);
		bst.add(21);
		bst.add(17);
		// bst.add(17);

		System.out.println(bst);
		
//		System.out.println(bst.contains(16));
//		System.out.println(bst.contains(14));
//		System.out.println(bst.contains(2));
//		System.out.println(bst.contains(25));
		
		// Node not there
		bst.remove(2);
		
		// Case 1
		bst.remove(17);
		System.out.println("===Remove 17");
		System.out.println(bst);
		// Case 3
		bst.remove(14);
		System.out.println("===Remove 14");
		System.out.println(bst);
		// Case 2 (only right)
		bst.remove(20);
		System.out.println("===Remove 20");
		System.out.println(bst);
		// Case 2 (only left) 
		bst.remove(12);
		System.out.println("===Remove 12");
		System.out.println(bst);
		bst.remove(10);
		System.out.println("===Remove 10");
		System.out.println(bst);
		
		bst.remove(16);
		bst.remove(21);
		bst.remove(8);
		bst.remove(2);
		System.out.println("===Remove Everyone");
		System.out.println(bst);
		//bst.printInOrder();

//		bst.clear();
//		System.out.println("======");
//		
//		bst.add(12);
//		bst.add(14);
//		bst.add(10);
//		bst.add(21);
//		bst.add(17);
//		bst.add(20);
//		bst.add(8);
//		bst.add(16);
//
//		System.out.println(bst);
//		
//		bst.clear();
//		System.out.println("======");
//
//		bst.add(8);
//		bst.add(10);
//		bst.add(12);
//		bst.add(14);
//		bst.add(16);
//		bst.add(17);
//		bst.add(20);
//		bst.add(21);
//		
//		System.out.println(bst);
		
	}

}
