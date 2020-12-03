import java.util.ArrayList;

public class Heap<DataType extends Comparable<DataType>> {
	ArrayList<DataType> h = new ArrayList<DataType>();

	public Heap() {
		// To make sure the 0th element isn't used.
		h.add(null);
	}

	public void add(DataType item) {
		h.add(item);
		for (int idx = h.size() - 1; idx > 1; idx = idx / 2) {
			if (h.get(idx).compareTo(h.get(idx / 2)) > 0) {
				DataType t = h.get(idx);
				h.set(idx, h.get(idx / 2));
				h.set(idx / 2, t);
			}
		}
	}

	public DataType removeMax() {
		// Save a copy of the largest item
		DataType ret = h.get(1);

		// Remove the appropriate node from the bottom
		// and set its value to be at the root of the tree
		DataType last = h.get(h.size() - 1);
		h.remove(h.size() - 1);
		h.set(1, last);

		// Heapify-down
		int idx = 1;
		while (idx * 2 + 1 < h.size()) {
			DataType self = h.get(idx);
			DataType left = h.get(2 * idx);
			DataType right = h.get(2 * idx + 1);

			if (self.compareTo(left) < 0 && left.compareTo(right) > 0) {
				h.set(idx, left);
				h.set(idx * 2, self);
			} else if (self.compareTo(right) < 0 && right.compareTo(left) > 0) {
				h.set(idx, right);
				h.set(idx * 2 + 1, self);
			} else {
				break;
			}
		}
		return ret;
	}
}