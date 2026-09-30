package escribirFichero;

import java.io.*; 
public class EscribirFicherosFileWrite {

	public static void main(String[] args) {
		File ruta = new File (".", "mitexto.txt");  // ruta del fichero 
				
		try {
			//inicializamos objeto printWriter 
		PrintWriter escribir = new PrintWriter( new FileWriter(ruta));
			// cremos el objeto de salida  
			
	 
			// recorremos por cada  posicion la cadena 
			for(int i = 0; i<11; i++) {
				escribir.println("Escrito con PrintWriter"+i);
				
			}
			
			
			escribir.close();//cerramos programas 
			
		}catch(IOException e){
			
			System.out.println("Error: Entrada y Salida"+e.getMessage()); 
		}
		
		
		
		
	}

}
