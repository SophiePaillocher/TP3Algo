import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
classe de graphe non orientés permettant de manipuler en même temps des arcs (orientés) pour pouvoir stocker un arbre couvrant, en plus du graphe
*/

public class Graph implements Iterable<Edge>{

	int order;
	int edgeCardinality;
	ArrayList<LinkedList<Edge>> adjacency;
	ArrayList<LinkedList<Arc>> inAdjacency;
	ArrayList<LinkedList<Arc>> outAdjacency;
	ArrayList<Vertex> vertices;
	
	public boolean hasVertex(Vertex v) {
	    return vertices.contains(v);
	}

	/**
	 * Retourne un tableau vide
	 * @param size le nombre de lignes du tableau
	 * @param <T> le type des éléments contenus dans le tableau
	 * @return Le tableau
	 */
	public <T> ArrayList<LinkedList<T>> makeList(int size) {
		ArrayList<LinkedList<T>> res = new ArrayList<>(size);
		for(int i = 0; i <= size; i++) {
			res.add(null);			
		}
		return res;
	}
	//upperBound est l'ordre maximal du graphe
	public Graph(int upperBound) {
	    order = 0;
	    adjacency = makeList(upperBound);
	    vertices = new ArrayList<>(upperBound);
	
	}

	/**
	Ajoute un sommet en l'insérant à la position id dans la liste des sommets du graphe
	*/
	public void addVertex(Vertex vertex) {
        order++; //prévoir une exception si ordre > upperbound
		vertices.add(vertex.getId(), vertex)
	}
	
	public void ensureVertex(int indexVertex) {
	    // à remplir
	}	
	
	public void addArc(Arc arc) {
	    // à remplir
        //si un des deux sommets n'existe pas, lancer une exception
	}
	
	public void addEdge(Edge e) {
	    // à remplir
        // e = (u,v)
        //if not hasVertex(u) do order++
        //if not hasVertex(v) do order++
        //adjacency(u).add(v)
        //adjacency(v).add(u)
	}

	public Graph kruskal (){
        UnionFind ensemble = new UnionFind(order);
        //trier les arêtes par ordre croissant de leurs poids
        // pour chaque arête (u,v)
        //si ensemble.find(u) != ensemble.find(v)
        // alors ensemble.union(u,v)
        //retourner ensemble
	    return null;
    }

	public LinkedList<Arc> outNeighbours(int sommet) {
		return outAdjacency.get(sommet);
	}
}
