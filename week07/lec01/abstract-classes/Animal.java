public abstract class Animal {
        // The latin species name that Bio people use
        private String species;
        // The name of the animal (like Fred)
        private String name;

        public Animal(String species, String name) {
                this.species = species;
                this.name = name;
        }

        // Method 1: Get Name
        public String getName() {
                return this.name;
        }

        // Method 2: Make Sound
        public abstract void makeSound();
}