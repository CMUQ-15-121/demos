import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Graph {
	private HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();

	public Graph() {	
	}
	
	public Graph(String filename) {
		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException fne) {
			System.err.println("File not found!");
			return;
		}

		Scanner inp = new Scanner(fr);
		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] vals = line.split(",");
			if (vals.length != 3) {
				System.err.println("Invalid file format");
				return;
			}
			String src = vals[0];
			String dst = vals[1];
			int w = Integer.parseInt(vals[2]);
			// Make sure we have vertex objects for each vertex on this line
			addVertex(src);
			addVertex(dst);

			// Want: Add an edge to srcV that is srcV -> dstV with weight w.
			addEdge(src, dst, w);
			// Want: Add an edge to dstV that is dstV -> srcV with weight w.
			addEdge(dst, src, w);
		}
	}

	public void addVertex(String vertexName) {
		if (!vertices.containsKey(vertexName)) {
			Vertex tmp = new Vertex(vertexName);
			vertices.put(vertexName, tmp);
		}
	}

	public void addEdge(String src, String dst, int weight) {
		Vertex srcV = vertices.get(src);
		Vertex dstV = vertices.get(dst);

		srcV.addEdge(dstV, weight);
	}

	public Graph MSTPrims() {
		HashSet<Vertex> verticesInMST = new HashSet<Vertex>();
		ArrayList<Edge> sortedEdges = new ArrayList<Edge>();
		HashSet<Edge> finalEdges = new HashSet<Edge>();

		// Pick an arbitrary vertex from this.vertices
		Vertex starter = null;
		for (String s : this.vertices.keySet()) {
			starter = this.vertices.get(s);
			break;
		}

		// Add my starter vertex to my "in" set
		verticesInMST.add(starter);
		// Add the starter vertex's edges to sortedEdges
		sortedEdges.addAll(starter.getEdges());
		Collections.sort(sortedEdges);

		while (verticesInMST.size() < this.vertices.size()) {
			// Get the smallest edge going out from our current MST
			Edge e = sortedEdges.remove(0);

			// Check if the dst is already in the mst
			if (verticesInMST.contains(e.getDst())) {
				continue;
			}
			
			// At least one vertex is new
			verticesInMST.add(e.getDst());
			
			// Add the new vertex's edges to our sorted list
			sortedEdges.addAll(e.getDst().getEdges());
			Collections.sort(sortedEdges);
			
			// Add this edge to our final set of edges for the MST
			finalEdges.add(e);
		}
		
		// Hopefully, here we have a finished set of edges
		//System.out.println(finalEdges);
		Graph MST = new Graph();
		for(Edge e: finalEdges) {
			MST.addVertex(e.getSrc().getName());
			MST.addVertex(e.getDst().getName());
			MST.addEdge(e.getSrc().getName(), e.getDst().getName(), e.getWeight());
			MST.addEdge(e.getDst().getName(), e.getSrc().getName(), e.getWeight());
		}
		return MST;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Vertex v : vertices.values()) {
			sb.append("Vertex " + v + "\n\t");
			sb.append(v.getEdges().toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Graph g = new Graph("graph_example1.txt");
		System.out.println(g);
		Graph MST = g.MSTPrims();
		System.out.println("---");
		System.out.println(MST);
	}
}
