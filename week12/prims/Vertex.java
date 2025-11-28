import java.util.ArrayList;

public class Vertex {
	private String name;
	private ArrayList<Edge> edges;
	
	public Vertex(String name) {
		this.name = name;
		this.edges = new ArrayList<Edge>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}
	
	public void addEdge(Vertex dst, int cost) {
		this.edges.add(new Edge(cost, this, dst));
	}
	
	@Override
	public String toString() {
		return "("+name+")";
	}
	
}
