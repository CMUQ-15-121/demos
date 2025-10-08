public class Person implements Comparable<Person> {
        private String name;
        private int age;
                
        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }
                
        @Override
        public String toString() {
                return "Person [name=" + name + ", age=" + age + "]";
        }

        // Return a negative number if this < p
        // Return a positive number if this > p
        // Return 0 if this == p
		@Override
		public int compareTo(Person p) {
			// Idea 1: Sort by age
//			if (this.age < p.age) {
//				return -1;
//			} else if (this.age > p.age) {
//				return 1;
//			} else {
//				return 0;
//			}
			//return this.age - p.age;
			
			// Idea 2: Sort by name
			//return this.name.compareTo(p.name);
			
			// Idea 3: Sort by name, break tie by age
			int res = this.name.compareTo(p.name);
			if (res != 0) {
				return res;
			}
			
			return this.age - p.age;
		}
}