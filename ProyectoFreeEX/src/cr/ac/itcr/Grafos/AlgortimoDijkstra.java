/**
 *   clase  que se va a encargar  de buscar la ruta m�s corta  de llegada   del mensaje  que se genere con las ubicaciones que cree el servidor 
 *   
 *   
 *   
 */
package cr.ac.itcr.Grafos;
import java.io.*;
import cr.ac.itcr.Grafos.*;
import java.util.*;

/**
 * @author Jonathan Garcia
 *
 */
public class AlgortimoDijkstra {

 
	 

	 


	/**
	 * 
	 */
	





  
	/**
	 *       // Dijkstra's algorithm to find shortest path from s to all other nodes
		
	 */
		   
		      public static int [] dijkstra (Grafo g, int s) {
		         final int [] dist = new int [g.getNumberOfVertices()];  // recibe las distancias  mas cortas del algoritmo prim 
		         final int [] pred = new int [g.getNumberOfVertices()];  // preceeding node in path
		         final boolean [] visited = new boolean [g.getNumberOfVertices()]; // all false initially
		   
		       for (int i=0; i<dist.length; i++) {
		           dist[i] =  1;
		           
		        }
		       
		        dist[s] = 0;
		 
		       for (int i=0; i<dist.length; i++) {
		           final int next = minVertex (dist, visited);
		           visited[next] = true;
		  
		           // The shortest patggh to next is dist[next] and via pred[next].
		  
		           final int [] n = new int [g.cuentaCaminosTotales()];
		           
		           for (int j=0; j<n.length; j++) {
		              final int v = n[j];
		              final int d = dist[next] ;
		              if (dist[v] > d) {
		                 dist[v] = d;
		                 pred[v] = next;
		              }
		           }
		        }
		        return pred;  // (ignore pred[s]==0!)
		     }
		 
		     private static int minVertex (int [] dist, boolean [] v) {
		        int x = Integer.MAX_VALUE;
		        int y = -1;   // graph not connected, or no unvisited vertices
		        for (int i=0; i<dist.length; i++) {
		           if (!v[i] && dist[i]<x) {y=i; x=dist[i];}
		        }
		        return y;
		     }
		  
		     public static void printPath (Grafo g, int [] pred, int s, int e) {
		        final java.util.ArrayList path = new java.util.ArrayList();
		        int x = e;
		        while (x!=s) {
		           path.add (0, g.getNumberOfAristas());
		           x = pred[x];
		        }
		        path.add (0, g.getNumberOfAristas());
		        System.out.println (path);
		     }
		  
		  }
	
	
	///////////////////777


