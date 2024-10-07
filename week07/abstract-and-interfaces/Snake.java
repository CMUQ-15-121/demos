
public class Snake extends Animal {
	
	public Snake(String name) {
		super("pythonidae", name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Sssss");
	}

}
