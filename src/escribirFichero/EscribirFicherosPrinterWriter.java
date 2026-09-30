package escribirFichero;

import java.io.*; 
public class EscribirFicherosPrinterWriter {

	public static void main(String[] args) {
		File ruta = new File (".", "mitext.txt");  // ruta del fichero 
				
		try {
			//con true nos permite añadir elementos sin borrar lo que teniamos 
			FileWriter escribir =  new FileWriter(ruta, true);
			// cremos el objeto de salida  
			String texto = "Hola, esto es una prueba de FileWriter"; 
			// variable de cadena 
			//convertimos la cadena  en   array de  tipo char en cadena  
			char[] conversion = texto.toCharArray(); 
			
			// recorremos por cada  posicion la cadena 
			for(int i = 0; i<conversion.length; i++) {
				escribir.write(conversion[i]);
			}
			
			escribir.append("*"); // añadimos al final un * 
			escribir.close();//cerramos programas 
			
		}catch(IOException e){
			
			System.out.println("Error: Entrada y Salida"+e.getMessage()); 
		}
		
		
		
		
	}

}
