/*
 * @author   by jonathan Garcia 
 * 
 * 
 * Derechos:   se   analizó   un codigo de  un blog  de internet  para  basarse  en la creacion de codigo del  grafo.
 *  ademas   se toman  como referencia el libro de joyanes  y   java2.
 *  
 * 
 */
package cr.ac.itcr.Grafos;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;



public class Grafo {

	
	
		private final int MAX_VERTICES;
		private final int MAX_ARISTAS;
	
		private int nroAristas;
		private int grafo[][];
		
		//Creaewewe un grafo vacío, con un máximo numero de vertices y aristas
		
		public Grafo(int nroVertices, int  nroAristas  ){
			MAX_VERTICES = nroVertices;
			MAX_ARISTAS = nroAristas;
			
			this.nroAristas = 0;
			
			grafo = new int[MAX_VERTICES][MAX_VERTICES];
			
			for(int i = 0; i < getNumberOfVertices();i++){
				for (int j = 0; j < getNumberOfVertices(); j++){
					
					if (i==j){
						grafo[i][j]=0;
					}
					
				}
			}
		}
		
		public Grafo(int nroVertices){
		
			
			this(nroVertices, nroVertices);
		}
		
		

		public int getNumberOfVertices ()
		{
			return MAX_VERTICES;
		}

		public int getNumberOfAristas()
		{
			return MAX_ARISTAS;
		}
		
		
		/*
		 * este metodo  inserta  la  distancia que haty entre  dos   nodos.
		 * 
		 */
		public void insertaArista(int nodo1, int nodo2, int distancia )
					throws ArrayIndexOutOfBoundsException, UnsupportedOperationException
		{
			if(nodo1 >= MAX_VERTICES || nodo2 >= MAX_VERTICES){ 
				throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
						"\nRango de vertices: 0 - " + (getNumberOfVertices () - 1));
			}
			else if(nroAristas == MAX_ARISTAS){
				throw new UnsupportedOperationException("No se puede añadir más aristas porque   no se creo  de fotrma correcta la  matriz");
			}		
			else{
				grafo[nodo1][nodo2] = distancia ;
			}
		}
		
		//Retorna verdadero si existe una arista dirigida entre los vertices v1 y v2
		public boolean existeArista(int v1, int v2){
			if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
				throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
						"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
			}
			else if(grafo[v1][v2] == 1){
				return true;
			}		
			return false;
		}
		
		//Elimina la arista entre los vertices v1 y v2
		public void eliminaArista(int v1, int v2){
			if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
				throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
						"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
			}
			else if(grafo[v1][v2] == 0){
				System.err.println("La arista NO existe");
			}
			else{
				grafo[v1][v2] = 0;
			}
		}
		
		//Elimina todas las aristas. Se llena toda la matriz de ceros
		public void liberaGrafo(){
			for(int i = 0; i < grafo.length; i++){
				for(int j = 0; j < grafo[i].length; j++){
					grafo[i][j] = 0;
				}
			}
		}
		
		public void mostrarGrafo(){
			System.out.print(" ");
			for(int i = 0; i < MAX_VERTICES; i++)
			{
				System.out.printf("  %3d", i);
			}
			System.out.println();
			for( int i = 0; i < MAX_VERTICES; i++){
				System.out.printf(" %3d", i);
				for(int j = 0; j < MAX_VERTICES; j++){
					System.out.printf(" %3d" ,grafo[i][j]);
				}
				System.out.println();
			}
		}
	
}
