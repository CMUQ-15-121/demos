package stack;

public class StackTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new LinkedListStack<String>(); //new ArrayListStack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("Peek: "+ stack.peek());
		
		while(!stack.isEmpty()) {
			System.out.println("Pop: "+ stack.pop());

		}

	}
}
