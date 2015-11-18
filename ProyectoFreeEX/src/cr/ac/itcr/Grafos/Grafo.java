package cr.ac.itcr.Grafos;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;



public class Grafo {

	/*File: Grafo.java
	 *Descripci�n: Grafo Dirigido implementado con matrices de adyacencia.
	 *Las aristas no van a tener peso, por lo tanto la matriz es binaria, 
	 *un valor de 1 indica que existe una arista entre dos vertices, y un valor
	 *de cero indica que no existe una arista entre los vertices.*/

	
		private final int MAX_VERTICES;
		private final int MAX_ARISTAS;
		private int nroAristas;
		private int grafo[][];
		
		//Crea un grafo vac�o, con un m�ximo numero de vertices y aristas
		public Grafo(int nroVertices, int  nroAristas){
			MAX_VERTICES = nroVertices;
			MAX_ARISTAS = nroAristas;
			
			this.nroAristas = 0;
			
			grafo = new int[MAX_VERTICES][MAX_VERTICES];
			
			for(int i = 0; i < getMAX_VERTICES();i++){
				for (int j = 0; j < getMAX_VERTICES(); j++){
					grafo[i][j] = 0;
				}
			}
		}
		
		//Crea un grafo vac�o, con un m�ximo n�mero de vertices, y 
		//vertices al cuadrado como n�mero m�ximo de aristas.
		public Grafo(int nroVertices){
			//Llamada al constructor con dos argumentos
			this(nroVertices, nroVertices);
		}
		
		//Crea un grafo vac�o con un m�ximo n�mero de vertices = 5
		//y m�ximo numero de aristas = 25.
		public Grafo(){
			//Llamada al constructor con dos argumentos
			this(5,25);
		}

		public int getMAX_VERTICES()
		{
			return MAX_VERTICES;
		}

		public int getMAX_ARISTAS()
		{
			return MAX_ARISTAS;
		}
		
		//Inserta una arista entre dirigida del vertice v1 al vertice v2
		public void insertaArista(int v1, int v2)
					throws ArrayIndexOutOfBoundsException, UnsupportedOperationException
		{
			if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
				throw new ArrayIndexOutOfBoundsException("Vertices inv�lidos, fuera de rango"+
						"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
			}
			else if(nroAristas == MAX_ARISTAS){
				throw new UnsupportedOperationException("No se puede a�adir m�s aristas");
			}		
			else{
				grafo[v1][v2] = 1;
			}
		}
		
		//Retorna verdadero si existe una arista dirigida entre los vertices v1 y v2
		public boolean existeArista(int v1, int v2){
			if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
				throw new ArrayIndexOutOfBoundsException("Vertices inv�lidos, fuera de rango"+
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
				throw new ArrayIndexOutOfBoundsException("Vertices inv�lidos, fuera de rango"+
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
