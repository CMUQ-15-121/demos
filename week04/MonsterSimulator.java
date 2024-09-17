
public class MonsterSimulator {

	public MonsterSimulator() {
		Monster m1 = new Monster("Bob", 20, 2);
		Monster m2 = new Monster("Jim", 15, 3);
		
		m1.attack(m2);
		
		System.out.println(m1);
		System.out.println(m2);
	}

	public static void main(String[] args) {
		new MonsterSimulator();
	}

}
