
public class StackTester {


	public static void main(String[] args) {
		Stack<String> myStack = new LinkedListStack<String>();
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");

		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}

	}

}
