import java.util.ArrayList;
import java.util.Objects;

public class Vertex {
	private String name;
	private ArrayList<Edge> edges = new ArrayList<Edge>();

	public Vertex(String name) {
		super();
		this.name = name;
	}

	public void addEdge(Vertex dst, int weight) {
		Edge tmp = new Edge(this, dst, weight);
		edges.add(tmp);
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name;
	}

}
