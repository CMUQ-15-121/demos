import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Graph {
	private HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();

	/**
	 * Construct a graph based on a set of edges
	 * 
	 * @param edges The edges of the new Graph
	 */
	public Graph(ArrayList<Edge> edges) {
		for (Edge e : edges) {
			String src = e.getSrc().getName();
			String dst = e.getDst().getName();
			addVertex(src);
			addVertex(dst);
			addEdge(src, dst, e.getCost());
			addEdge(dst, src, e.getCost());
		}
	}

	/**
	 * Construct a graph based on a file.
	 * 
	 * @param filename The name of the file containing the graph
	 */
	public Graph(String filename) {
		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException fne) {
			System.err.println("File not found");
			return;
		}

		Scanner inp = new Scanner(fr);
		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] vals = line.split(",");
			if (vals.length != 3) {
				System.err.println("Error with file line");
				continue;
			}
			String src = vals[0];
			String dst = vals[1];
			int cost = Integer.parseInt(vals[2]);

			// Make sure both vertices related to this edge are added to the graph
			addVertex(src);
			addVertex(dst);

			// Add the edge to the Graph, going both ways since the graph is undirected.
			addEdge(src, dst, cost);
			addEdge(dst, src, cost);
		}

	}

	/**
	 * Use Prim's algorithm to find a minimum spanning tree for the current graph.
	 * Then create and return a new graph containing only those edges.
	 * 
	 * @return A graph of the MST for the current graph.
	 */
	public Graph Prims() {
		HashSet<String> inMst = new HashSet<String>();
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		ArrayList<Edge> finalEdges = new ArrayList<Edge>();

		// Choose an arbitrary starter vertex
		String starter = null;
		for (String s : this.vertices.keySet()) {
			starter = s;
			break;
		}

		// Add the edges from the starter vertex to the PQ
		inMst.add(starter);
		for (Edge e : this.vertices.get(starter).getEdges()) {
			pq.add(e);
		}

		// While we still need more nodes for the MST...
		while (inMst.size() < this.vertices.size()) {
			// Get the smallest edge leaving the current MST
			Edge e = pq.poll();
			// Make sure it doesn't go to a node already in the MST
			String dst = e.getDst().getName();
			if (inMst.contains(dst)) {
				continue;
			}

			// Now we know that e needs to be added to the MST
			finalEdges.add(e);
			inMst.add(dst);

			// Add the new node's edges to the PQ
			for (Edge t : this.vertices.get(dst).getEdges()) {
				pq.add(t);
			}
		}

		// Build and return a new Graph containing only the MST edges
		return new Graph(finalEdges);
	}

	public void addVertex(String name) {
		if (!this.vertices.containsKey(name)) {
			this.vertices.put(name, new Vertex(name));
		}
	}

	public void addEdge(String src, String dst, int cost) {
		Vertex srcV = this.vertices.get(src);
		Vertex dstV = this.vertices.get(dst);
		srcV.addEdge(dstV, cost);
	}

	public void printGraph() {
		for (String vertexName : this.vertices.keySet()) {
			System.out.println(vertexName);
			Vertex tmp = this.vertices.get(vertexName);
			for (Edge e : tmp.getEdges()) {
				System.out.println("\t" + e);
			}
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph("graph_example1.txt");
		// System.out.println(g.vertices);
		// g.printGraph();
		Graph mst = g.Prims();
		mst.printGraph();
	}
}
