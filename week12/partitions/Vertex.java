import java.util.ArrayList;

public class Vertex {
	private String name;
	private ArrayList<Edge> edges = new ArrayList<Edge>();
	private int partition = 0;

	public Vertex(String name) {
		this.name = name;
	}

	public void addEdge(Vertex dst, int weight) {
		Edge tmp = new Edge(this, dst, weight);
		edges.add(tmp);
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public int getPartition() {
		return partition;
	}

	public void setPartition(int partition) {
		this.partition = partition;
	}
}