
public class Dog {
	public Dog() {
		return;
	}
	
	public int bark() {
		System.out.println("Bark!");
		return 5;
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
	}
}
