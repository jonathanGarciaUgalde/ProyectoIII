package cr.ac.itcr.Grafos;


public class AlgoritmoPrim {
	Grafo g;

	boolean  estaNodo;
	int nNodos;
	int nCaminosTotales;

	int nNodos;
	int nCaminosTotales;
   

	int [][]matriz= new int[g.getNumberOfVertices()][g.getNumberOfVertices()];
	
	public AlgoritmoPrim();
	   
	   public AlgoritmoPrim(Grafo grafo  ){

		    nNodos= grafo.getNumberOfVertices();
		    nCaminosTotales=grafo.cuentaCaminosTotales();
	   }
public boolean tieneCiclo(){
     int  contador;
     boolean respuesta=false;
     
	for (int j = 0; j < nNodos; j++) {
        for (int k = 0; k <nNodos; k++){
        if(matriz[j][k]!=0 && matriz[j][k]!=g.infinito()){
        	contador++;
          	
        }
        if(contador==3){
        	respuesta=true;
        	break;
        	
        }
        }
}

	
return respuesta;

}	  


public void cargaMatriz(){

	
	for (int j = 0; j <g.getNumberOfVertices(); j++) {
    
		for (int k = 0; k <g.getNumberOfVertices(); k++){
  
			
	matriz [j][k]= g.GrafoCreado()[j][k];
	}
}
	}



	  
	   
	  public void prim(){
	      
	            for (int j = 0; j < nNodos; j++) {
	                for (int k = 0; k <nNodos; k++){
	                    if(g.hayCaminos()){
	                        for (int h = 0; h < g.getNumberOfVertices(); h++) {
	                        	if(matriz[j][k]<1&& matriz[j][k]<25 ){
	                        		
	                        	}
	                             if(nNodos==k ){
	                                 this.estaNodo=true; 
	                                 break;
	                             }
	                        }
	                       
	                        } 
	                    if(estaNodo==false){
		                           g.eliminaCamino(j, k); 
                        
	                    }
	                    
	                       
	                }
	            }
	  public [][]algoritmoPrimListo(){
		  return matriz;
		  
	  }          
	  }
	  }
	            
	            
	            
	 
	
//fin