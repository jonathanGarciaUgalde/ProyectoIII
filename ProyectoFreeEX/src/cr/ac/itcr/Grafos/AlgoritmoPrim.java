package cr.ac.itcr.Grafos;
import cr.ac.itcr.Grafos.Grafo;


public class AlgoritmoPrim {
	   /*
	   
	    public static Grafo PrimsAlgorithm (Grafo g, int s)
	    {
	        int n = g.getNumberOfVertices();
	        
	         int  table[][] = new int [n][n];
	        for (int v = 0; v < n; ++v)
	            table [v] = new Entry ();
	        table [s].distance = 0;
	        
	        PriorityQueue queue =
	            new BinaryHeap (g.getNumberOfEdges());
	            
	        queue.enqueue (
	            new Association (new Int (0), g.getVertex (s)));
	            
	        while (!queue.isEmpty ())
	        {
	            Association assoc = (Association) queue.dequeueMin();
	            Vertex v0 = (Vertex) assoc.getValue ();
	            
	            int n0 = v0.getNumber ();
	            if (!table [n0].known)
	            {
	                table [n0].known = true;
	                Enumeration p = v0.getEmanatingEdges ();
	                while (p.hasMoreElements ())
	                {
	                    Edge edge = (Edge) p.nextElement ();
	                    Vertex v1 = edge.getMate (v0);
	                    int n1 = v1.getNumber ();
	                    Int wt = (Int) edge.getWeight ();
	                    int d = wt.intValue ();
	                    if (!table[n1].known && table[n1].distance>d)
	                    { 
	                        table [n1].distance = d;
	                        table [n1].predecessor = n0;
	                        queue.enqueue (
	                            new Association (new Int (d), v1));
	                    }
	                }
	            }
	        }
	        Graph result = new GraphAsLists (n);
	        for (int v = 0; v < n; ++v)
	            result.addVertex (v);
	        for (int v = 0; v < n; ++v)
	        {
	            if (v != s)
	                result.addEdge (v, table [v].predecessor);
	        }
	        return result;
	    }
	}
	
	
*/

	/*
	public class Algoritmo_Prim {
	    
	    private int cumulado;
	   private int aristaMenor;
	   private int  fin;
	   private boolean estaNodo=false;
	   private boolean aumentaTamano;
	   private int nodoApuntado;  
	   private int nodoApuntador;
	   private int tamano;
	   private int arsitaMayor;
	   private  Arboles arboles;
	   private int tope;
	   private  int  nodoOrigen;
	   
	   
	   
	   public Algoritmo_Prim(Arboles arbol , int top ,int aristaMayor ){
	       this.cumulado = 0;
	       this.aristaMenor = 0;
	       this.fin = 0;
	       this.estaNodo=false;
	       this.aumentaTamano = false;
	       this.nodoApuntado = 0;  
	       this.nodoApuntador = 0;
	       this.tamano = 1;
	       this. arsitaMayor=aristaMayor;
	       this.arboles = arbol;
	       this.tope = top;
	   }

	    public int getCumulado() {
	        return cumulado;
	    }
	  
	   
	  public void prim(){
	      this.nodoOrigen= ingresarNodoOrigen("Ingrese Nodo Origen..","nodo Origen No existe",tope);
	       jPanel1.paint(jPanel1.getGraphics());
	       R_repaint(tope,arboles);
	       arboles.crearEnArbol(tope);
	       arboles.setEnArbol(0, nodoOrigen);
	       //algoritmo de Prim ---->>
	       do{
	           this.aristaMenor = this.arsitaMayor;
	           this.fin=2;
	            for (int j = 0; j < tamano; j++) {
	                for (int k = 0; k < tope; k++){
	                    if(arboles.getmAdyacencia(k, arboles.getEnArbol(j))==1){
	                        for (int h = 0; h < tamano; h++) {
	                             if(arboles.getEnArbol(h)==k ){
	                                 this.estaNodo=true; 
	                                 break;
	                             }
	                        }
	                        if(estaNodo==false){
	                            if(arboles.getmCoeficiente(k, arboles.getEnArbol(j))<=aristaMenor && arboles.getmCoeficiente(k, arboles.getEnArbol(j))>0 ){
	                                 aristaMenor=arboles.getmCoeficiente(k, arboles.getEnArbol(j));
	                                 this.nodoApuntado=k;
	                                 this.aumentaTamano=true;
	                                 this.nodoApuntador=arboles.getEnArbol(j);
	                                 this.fin=1;
	                            }
	                        }
	                        this.estaNodo=false;
	                    }
	                }
	            }//fin  for (int j = 0; j < tamano; j++)              
	         if(aumentaTamano==true){
	                    Pintar.pintarCamino(jPanel1.getGraphics(),arboles.getCordeX(nodoApuntador), arboles.getCordeY(nodoApuntador),arboles.getCordeX(nodoApuntado), arboles.getCordeY(nodoApuntado),Color.red); 
	                    Pintar.clickSobreNodo(jPanel1.getGraphics(),arboles.getCordeX(nodoApuntador), arboles.getCordeY(nodoApuntador), null,Color. red);
	                    Pintar.clickSobreNodo(jPanel1.getGraphics(),arboles.getCordeX(nodoApuntado), arboles.getCordeY(nodoApuntado), null, Color.red);                                  
	                    arboles.setEnArbol(tamano, nodoApuntado);
	                    this.tamano++;
	                    this.aumentaTamano=false;
	                    this.cumulado += this.aristaMenor;
	         }
	        }while(fin<2);
	   }
	    
	}
	*/
}//fin