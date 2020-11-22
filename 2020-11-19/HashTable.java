import java.util.ArrayList;

public class HashTable<DataType> {
	private static final int NUM_BUCKETS = 1000;
	private ArrayList<DataType>[] buckets;
	
	public HashTable() {
		buckets = new ArrayList[NUM_BUCKETS];
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<DataType>();
		}
	}
	
	public void add(DataType item) {
		System.out.println("Hash code: " + item.hashCode());
		int bucket = Math.abs(item.hashCode()) % NUM_BUCKETS;
		System.out.println("Scaled hash code: " + bucket);
		buckets[bucket].add(item);
	}
	
	public boolean contains(DataType item) {
		int bucket = Math.abs(item.hashCode()) % NUM_BUCKETS;
		return buckets[bucket].contains(item);
	}

	public static void main(String[] args) {
		HashTable<String> ht = new HashTable<String>();
		ht.add("Ryan Riley");
		ht.add("Ahmed");
		ht.add("Sameera");
		
		System.out.println(ht.contains("Ryan"));
		System.out.println(ht.contains("Ryan Riley"));

	}

}
