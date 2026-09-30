package listarFichero;
import java.io.*;
public class ListarFichero {

	 public static void main(String[] args) {
	        
	        //Creo el objeto file
	        File fichero = new File ("file.txt");
	        //File fichero = new File ("folder");
	        //File fichero = new File("src/ClaseFile/Clase2.java"); 
	        
	        try {

	            //Creo el archivo en el equipo de ejecucións
	            fichero.createNewFile();
	            //fichero.mkdirs();
	            
	            System.out.println("------- Información sobre el fichero --------");
	            System.out.println(" · Nombre: " + fichero.getName());
	            System.out.println(" · Ruta relativa: " + fichero.getPath());
	            System.out.println(" · Ruta absoluta: " + fichero.getAbsolutePath());
	            
	            //Hago la comprobación de si se puede leer y despues imprimo en funcion del resultado
	            if (fichero.canRead() == true) { 
	                System.out.println(" · Posibilidad de leer: Sí");
	            } else { 
	                System.out.println (" · Posibilidad de leer: No");
	            }
	            
	            //Hago la comprobación de si se puede escribir y despues imprimo en funcion del resultado
	            if (fichero.canWrite() == true) { 
	                System.out.println(" · Posibilidad de escribir: Sí" );
	            } else { 
	                System.out.println (" · Posibilidad de escribir: No" );
	            }
	            
	            System.out.println(" · Tamaño: " + fichero.length());
	            
	            //Compruebo si es un fichero o un directorio y imprimo el tipo en funcion del resultado
	            if (fichero.isFile()) {
	                System.out.println(" · Tipo: Es un fichero");
	            } else if (fichero.isDirectory()) {
	                System.out.println(" · Tipo: Es un directorio");
	            }
	            
	            //Saco la ruta absoluta en forma de objeto File, busco el padre del fichero y extraigo el nombre
	            System.out.println(" · Directorio padre: " + fichero.getAbsoluteFile().getParentFile().getName());

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            if (fichero.exists()) fichero.delete();
	        }

	    }

}
