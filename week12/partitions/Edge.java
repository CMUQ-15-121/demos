public class Edge {
	private Vertex src;
	private Vertex dst;
	private int weight;

	public Edge(Vertex src, Vertex dst, int weight) {
		this.src = src;
		this.dst = dst;
		this.weight = weight;
	}

	public Vertex getSrc() {
		return this.src;
	}

	public Vertex getDst() {
		return this.dst;
	}

	public int getWeight() {
		return this.weight;
	}
}