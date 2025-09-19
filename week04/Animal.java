package Practice;

public class Animal {
    protected String type;

    public Animal(String type) {
        this.type = type;
        System.out.println("Animal constructor: " + type);
    }

    public void speak() {
        System.out.println("Generic sound");
    }

    public String toString() {
        return "Animal: " + type;
    }
}


