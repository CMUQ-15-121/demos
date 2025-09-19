package Practice;

public class Cat extends Animal {
    private int lives;

    public Cat(String type, int lives) {
        super(type);
        this.lives = lives;
        System.out.println("Cat constructor: lives = " + lives);
    }

    @Override
    public void speak() {
        System.out.println(type + " says Meow!");
    }

    public String toString() {
        return "Cat (" + type + ", " + lives + " lives)";
    }

    public static void main(String[] args) {
        Animal a = new Cat("Tabby", 9);
        a.speak();
        System.out.println(a);
    }
}
