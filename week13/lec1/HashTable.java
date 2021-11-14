import java.util.ArrayList;
import java.util.Random;

public class HashTable<DataType> {
	private ArrayList<DataType>[] buckets;
	
	public HashTable(int numItems) {
		this.buckets = new ArrayList[numItems*13/10]; // A multiplier of 1.3 is pretty good.  I hope.
		for(int i = 0; i < this.buckets.length; i++) {
			this.buckets[i] = new ArrayList<DataType>();
		}
	}
	
	public void add(DataType item) {
		//System.out.println("Hashcode: "+item.hashCode());
		int bucket = Math.abs(item.hashCode()) % this.buckets.length;
		//System.out.println("Scaled: " + bucket);
		this.buckets[bucket].add(item);
	}
	
	public boolean contains(DataType item) {
		int bucket = Math.abs(item.hashCode()) % this.buckets.length;
		return this.buckets[bucket].contains(item);
	}
	
	public static void main(String[] args) {
//		HashTable<String> myT = new HashTable<String>(5);
//		myT.add("Hi there");
//		myT.add("Hi therE");
//		myT.add("Hi ther");
//		myT.add("fsdfdsafdsafdsa");
//		
//		System.out.println(myT.contains("Hi there"));
//		System.out.println(myT.contains("Hi therE"));
//		System.out.println(myT.contains("Hi ther"));
//		System.out.println(myT.contains("fsdfdsafdsafdsa"));
//		System.out.println(myT.contains("Hi"));
//		System.out.println(myT.contains("Hi t"));
//		System.out.println(myT.contains("Ryan"));
		
		HashTable<Integer> myT = new HashTable<Integer>(1000000);
		Random r = new Random();
		for(int i = 0; i < 1000000; i++) {
			int num = r.nextInt();
			myT.add(num);
		}
		
		MyTimer timer = new MyTimer();
		int[] nums = new int[1000000];
		for(int i = 0; i < 1000000; i++) {
			int num = r.nextInt();
			nums[i] = num;
		}
		timer.start();
		for(int i = 0; i < 1000000; i++) {
			myT.contains(nums[i]);
		}
		timer.stop();
		System.out.println("Time: " + timer.elapsed());
	}
}
