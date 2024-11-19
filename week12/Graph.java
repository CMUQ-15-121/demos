import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Graph {
	private HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();
	
	public Graph(ArrayList<Edge> edges) {
		for (Edge e: edges) {
			String src = e.getSrc().getName();
			String dst = e.getDst().getName(); 
			addVertex(src);
			addVertex(dst);
			addEdge(src, dst, e.getCost());
			addEdge(dst, src, e.getCost());
		}
	}

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
			//System.out.println(src + " " + dst + " " + cost);
			
			addVertex(src);
			addVertex(dst);
			
			addEdge(src, dst, cost);
			addEdge(dst, src, cost);
			
			
		}

	}
	
	public Graph Prims() {
		HashSet<String> inMst = new HashSet<String>();
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		ArrayList<Edge> finalEdges = new ArrayList<Edge>();
		
		// Choose an arbitrary vertex
		String starter = null;
		for(String s: this.vertices.keySet()) {
			starter = s;
			break;
		}
		//System.out.println(starter);
		
		inMst.add(starter);
		for(Edge e: this.vertices.get(starter).getEdges()) {
			pq.add(e);
		}
		
		while(inMst.size() < this.vertices.size()) {
			Edge e = pq.poll();
			String dst = e.getDst().getName();
			if (inMst.contains(dst)) {
				continue;
			}
			// Now we know that e needs to be added to the MST
			finalEdges.add(e);
			inMst.add(dst);
			for(Edge t: this.vertices.get(dst).getEdges()) {
				pq.add(t);
			}
		}
		
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
		for (String vertexName: this.vertices.keySet()) {
			System.out.println(vertexName);
			Vertex tmp = this.vertices.get(vertexName);
			for(Edge e: tmp.getEdges()) {
				System.out.println("\t" + e);
			}
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph("graph_example1.txt");
		//System.out.println(g.vertices);
		//g.printGraph();
		Graph mst = g.Prims();
		mst.printGraph();
	}
}
