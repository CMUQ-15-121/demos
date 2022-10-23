package TimeTesting;
import java.util.ArrayList;
import java.util.Random;

public class HashTable<DataType> {
	
	private ArrayList<DataType>[] buckets;
	
	public HashTable(int numItems) {
		this.buckets = new ArrayList[13 * numItems / 10];
		for(int i = 0; i < this.buckets.length; i++) {
			this.buckets[i] = new ArrayList<DataType>();
		}
	}
	
	public void add(DataType item) {
		int bucket = Math.abs(item.hashCode()) % this.buckets.length;
		this.buckets[bucket].add(item);
	}
	
	public boolean contains(DataType item) {
		int bucket = Math.abs(item.hashCode()) % this.buckets.length;
		return this.buckets[bucket].contains(item);
	}

	public static void main(String[] args) {
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
		System.out.println("Time: " + timer.elapsed() + " milliseconds");
	}
}
