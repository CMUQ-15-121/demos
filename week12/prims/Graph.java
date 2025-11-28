import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Graph {
	private HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();

	public Graph() {
		
	}
	/**
	 * Construct a graph based on a file.
	 * 
	 * @param filename The name of the file containing the graph
	 */
	public Graph(String filename) {
		FileReader fr = null;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException fne) {
			System.out.println(fne);
			return;
		}

		Scanner inp = new Scanner(fr);
		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] vals = line.trim().split(",");
			if (vals.length == 3) {
				// vals[0] -> src
				// vals[1] -> dst
				// vals[2] -> weight
				if (!this.vertices.containsKey(vals[0])) {
					Vertex src = new Vertex(vals[0]);
					this.vertices.put(vals[0], src);
				}
				if (!this.vertices.containsKey(vals[1])) {
					Vertex src = new Vertex(vals[1]);
					this.vertices.put(vals[1], src);
				}
				int weight = Integer.parseInt(vals[2]);
				Vertex src = this.vertices.get(vals[0]);
				Vertex dst = this.vertices.get(vals[1]);

				src.addEdge(dst, weight);
				dst.addEdge(src, weight);
			}
		}
	}

//	/**
//	 * Add a vertex to this graph.
//	 * 
//	 * @param name The name of the vertex to add
//	 */
//	public void addVertex(String name) {
//
//	}
//
//	/**
//	 * Add an edge to this graph
//	 * 
//	 * @param src  The src vertex
//	 * @param dst  The dst vertex
//	 * @param cost The weight
//	 */
//	public void addEdge(String src, String dst, int cost) {
//		Vertex srcV = this.vertices.get(src);
//		Vertex dstV = this.vertices.get(dst);
//		srcV.addEdge(dstV, cost);
//	}

	/**
	 * Use Prim's algorithm to find a minimum spanning tree for the current graph.
	 * Then create and return a new graph containing only those edges.
	 * 
	 * @return A graph of the MST for the current graph.
	 */
	public Graph Prims() {
		HashSet<String> verticesInMST = new HashSet<String>();
		ArrayList<Edge> edgesInMST = new ArrayList<Edge>();
		PriorityQueue<Edge> edges = new PriorityQueue<Edge>();
		
		// Choose an arbitrary vertex
		Vertex rand = null;
		for(String key: this.vertices.keySet()) {
			rand = this.vertices.get(key);
			break;
		}
		// Add the vertex to the MST
		verticesInMST.add(rand.getName());
		// Add all edges from the vertex to the PQ
		for(Edge e: rand.getEdges()) {
			edges.add(e);
		}
		
		while(verticesInMST.size() < this.vertices.size()) {
			Edge smallest = edges.poll();
			String dst = smallest.getDst().getName();
			if (verticesInMST.contains(dst)) {
				continue;
			}
			edgesInMST.add(smallest);
			verticesInMST.add(dst);
			for(Edge e: smallest.getDst().getEdges()) {
				edges.add(e);
			}
		}
		
		// Now we have two lists: Vertices and Edges that connect them.
		Graph MST = new Graph();
		// Add all MST nodes to the new graph
		for(String nodeName: verticesInMST) {
			MST.vertices.put(nodeName, new Vertex(nodeName));
		}
		// Add all MST edges to the new graph
		for(Edge e: edgesInMST) {
			Vertex src = MST.vertices.get(e.getSrc().getName());
			Vertex dst = MST.vertices.get(e.getDst().getName());
			src.addEdge(dst,  e.getCost());
			dst.addEdge(src,  e.getCost());
		}
		
		return MST;
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
		System.out.println(g.vertices);
		g.printGraph();
		System.out.println("----");
		Graph mst = g.Prims();
		mst.printGraph();
	}
}
