import java.util.*;


public class RandomParcours {

	Graph graph;
	List<Arc> frontier;
	BitSet reached;
	ArrayList<Arc> predecessor;
	
	private void etendsFrontiere(int sommet) {
		for (Arc a : graph.outNeighbours(sommet)) //outNeighbours retourne les arêtes sortantes du sommet ----> liste d'adjacence
			frontier.add(a);
	}
	
	
	private void explore(Arc a) {
		if (reached.get(a.getDest())) return;
		reached.set(a.getDest());
		etendsFrontiere(a.getDest());
		predecessor.set(a.getDest(), a);
	}
	
	private void parcours(int source) {
		reached.set(source);
		etendsFrontiere(source);
		explore (frontier.get((int) (Math.random()*(frontier.size()-1)))); // explore à partir d'un arc choisi aléatoirement dans la frontière
		
	}
	
	private RandomParcours(Graph graph) {
		this.graph = graph;
		this.frontier = new Stack<>();
		this.reached = new BitSet(graph.order);
		this.predecessor = new ArrayList<>(graph.order);
		for (int i = 0; i < graph.order; i++) {
			predecessor.add(null);
		}
	}
	

	public static ArrayList<Arc> algo(Graph graph, int source) {
		RandomParcours p = new RandomParcours(graph);
		p.parcours(source);
		return p.predecessor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
