
public class Edge implements Comparable<Edge> {

	protected Vertex source;
	protected Vertex dest;
	double weight;
	
	public Edge(Vertex source, Vertex dest, double weight) {
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
	
	public int compareTo(Edge e) {
		if (this.weight == e.weight) return 0;
		if (this.weight < e.weight) return -1;
		return 1;
	}
	
	public Vertex oppositeExtremity(Vertex vertex) {
		return (dest.getId() == vertex.getId() ? source : dest);
	}
	
	public Vertex getSource() {
		return this.source;
	}
	
	public Vertex getDest() {
		return this.dest;
	}
	
}
