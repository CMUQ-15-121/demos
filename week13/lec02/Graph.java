import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Graph {
	private HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();

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
			if (!vertices.containsKey(src)) {
				Vertex tmp = new Vertex(src);
				vertices.put(src, tmp);
			}
			if (!vertices.containsKey(dst)) {
				Vertex tmp = new Vertex(dst);
				vertices.put(dst, tmp);
			}
			
			Vertex srcV = vertices.get(src);
			Vertex dstV = vertices.get(dst);
			// Want: Add an edge to srcV that is srcV -> dstV with weight w.
			srcV.addEdge(dstV,  w);
			// Want: Add an edge to dstV that is dstV -> srcV with weight w.
			dstV.addEdge(srcV, w);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Vertex v: vertices.values()) {
			sb.append("Vertex " + v + "\n");
			sb.append(v.getEdges().toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Graph g = new Graph("graph_example1.txt");
		System.out.println(g);
	}
}
