import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
			if (vals.length == 1) {
				addVertex(vals[0]);
			} else if (vals.length == 3) {
				String src = vals[0];
				String dst = vals[1];
				int w = Integer.parseInt(vals[2]);
				addVertex(src);
				addVertex(dst);
				addEdge(src, dst, w);
				addEdge(dst, src, w);
			} else {
				System.err.println("Invalid file format");
				System.err.print(line);
				return;
			}
		}
		inp.close();
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
 
	/**
	 * Properly set the partition number for each vertex in the graph.
	 * 
	 * @return The number of distinct partitions.
	 */
  	public int setPartitions() {
		// You will write this code.
		int partNum = 1;

		for (String vertName : vertices.keySet()) {
			Vertex v = vertices.get(vertName);
			if (v.getPartition() == 0) {
				setPartitions(v, partNum++);
			}
		}
		return partNum;
	}
 
 	private void setPartitions(Vertex v, int p) {
		HashSet<Vertex> visited = new HashSet<Vertex>();
		ArrayList<Vertex> stack = new ArrayList<Vertex>();

		visited.add(v);
		stack.add(v);
		v.setPartition(p);
		while (!stack.isEmpty()) {
			Vertex curV = stack.remove(stack.size() - 1);
			for (Edge e : curV.getEdges()) {
				if (!visited.contains(e.getDst())) {
					visited.add(e.getDst());
					stack.add(e.getDst());
					e.getDst().setPartition(p);
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph("graph.txt");
		System.out.println(g.setPartitions());
		for (String vertName : g.vertices.keySet()) {
			Vertex v = g.vertices.get(vertName);
			System.out.println(vertName + ": " + v.getPartition());
		}
	}
}