import java.util.Random;

public class TreeTester {

	public static void main(String[] args) {
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		
		System.out.println(myTree.isEmpty());
		myTree.add(14);
		System.out.println(myTree.isEmpty());
		myTree.add(10);
		myTree.add(16);
		myTree.add(8);
		myTree.add(12);
		myTree.add(15);
		myTree.add(18);
		//myTree.add(9);
		
//		Random r = new Random();
//		for(int i = 0; i < 20; i++) {
//			int tmp = r.nextInt(100);
//			myTree.add(tmp);
//		}
		
		//myTree.printInOrder();

		
		System.out.println(myTree);
		
//		System.out.println(myTree.contains(14));
//		System.out.println(myTree.contains(16));
//		System.out.println(myTree.contains(12));
//		System.out.println(myTree.contains(13));
		
//		myTree.remove(18);
//		System.out.println("----------");
//		System.out.println(myTree);
//		
//		myTree.remove(16);
//		System.out.println("----------");
//		System.out.println(myTree);
//		
//		myTree.remove(15);
//		System.out.println("----------");
//		System.out.println(myTree);
		
		myTree.remove(14);
		System.out.println("----------");
		System.out.println(myTree);

	}

}
