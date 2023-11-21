import java.util.Objects;

public class Edge {
	private Vertex src;
	private Vertex dst;
	private int weight;

	public Edge(Vertex src, Vertex dst, int weight) {
		super();
		this.src = src;
		this.dst = dst;
		this.weight = weight;
	}

	public Vertex getSrc() {
		return src;
	}

	public Vertex getDst() {
		return dst;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dst, src, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		return Objects.equals(dst, other.dst) && Objects.equals(src, other.src) && weight == other.weight;
	}

	@Override
	public String toString() {
		//return "Edge [src=" + src + ", dst=" + dst + ", weight=" + weight + "]";
		return "("+src+", "+dst+", "+weight+")";
	}

}
