package BaseStation;

/**
 * Esta es  la clase  encarga de  de  levantar el servidor 
 *  implementar  los hilos
 *  
 *  
 *  @author Jonathan Garcia Ugalde
 * @author Gustavo Hernadez Granera
 * 
 *@since 11/09/2015
 * 
 *@version  7.0
 *
 */

import java.io.*;
import java.net.*;
import java.util.logging.*;

import javax.bluetooth.LocalDevice;


public class Servidor {
    
	public static void main(String args[]) throws IOException {
		servidorBT();
//		servidorInt();
	}
        
	
	public static void servidorBT() {
		try{
			//display local device address and name
	        LocalDevice localDevice = LocalDevice.getLocalDevice();
	        System.out.println("Address: "+localDevice.getBluetoothAddress());
	        System.out.println("Name: "+localDevice.getFriendlyName());
	        
	        ServidorHiloBT sampleSPPServer=new ServidorHiloBT();
	        sampleSPPServer.startServer();
		}
		catch(IOException ex){
			
		}
	}
	
	public static void servidorInt (){
	        ServerSocket ss;
	        System.out.print("Inicializando servidor... ");
	        try {
	            ss = new ServerSocket(8080);
	            System.out.println("\t[OK]");//
	            int idSession = 0;
	            while (true) {
	                Socket socket;
	                socket = ss.accept();
	                System.out.println("Nueva conexión entrante: "+socket);
	                ((ServidorHilo) new ServidorHilo(socket, idSession)).start();
	                idSession++;
	            }
	        } 
	        catch (IOException ex) {
	            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
	        }
		}
}