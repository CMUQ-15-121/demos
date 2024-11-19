
public class Edge implements Comparable<Edge> {
	private int cost;
	private Vertex src;
	private Vertex dst;

	public Edge(int cost, Vertex src, Vertex dst) {
		this.cost = cost;
		this.src = src;
		this.dst = dst;
	}

	public int getCost() {
		return cost;
	}

	public Vertex getSrc() {
		return src;
	}

	public Vertex getDst() {
		return dst;
	}

	@Override
	public String toString() {
		return src + "-[" + cost + "]->" + dst;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}
