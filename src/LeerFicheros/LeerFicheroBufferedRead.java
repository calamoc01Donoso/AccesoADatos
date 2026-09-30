 package LeerFicheros;

/***
 * @author Celia Álamo Calle 
 * @description: Vamos a hacer un programa en Java que nos muestre 
 * por la consola el código de fuente del contenido de este programa pasando el  bufferedReader  contiene el 
 * metodo readLine() que permite  leer  linea  del fichero 
 */


import java.io.*; 

public class LeerFicheroBufferedRead {

	public static void main(String[] args) {
		
		 String archivo = "mitexto.txt"; 
		 File fichero = new File (".", archivo);
		 
		 try (BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
	            String texto;
	            
	            //mientras  se pueda leer lo muestra en pantalla 
	            while ((texto = lector.readLine()) != null) {
	                System.out.println(texto);
	            }
	            
	        } catch (IOException e) {
	            System.err.println("n: " + e.getMessage());
	        }

	}

}
