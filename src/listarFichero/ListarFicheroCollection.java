package listarFichero;
import java.io.*;
import java.util.*;

public class ListarFicheroCollection {

	 public static void main(String[] args) {


	        File ruta = new File(".");
	        listarFichero(ruta); //
	      
	        
	        
	    }


public static void listarFichero(File ruta) {
	  LinkedList<File> listar = new LinkedList<>();
      
      // Creamos array de la clase File 
      File [] contenido = ruta.listFiles(); 
      
      // condicion de si no esta vacio 
      
      if(contenido !=null) {
          
          // recorremos los elementos 
          
          for(File insertar : contenido) {
              listar.push(insertar);
          }
          
          //mostramos la informacion  de todos los elementos 
          for(File mostrar : listar) {
              System.out.println("nombre: "+mostrar.getName());
              System.out.println("directorio "+mostrar.getAbsolutePath());
              System.out.println("Puede escribir "+mostrar.canRead()); 

              // ver si hay subdirectorio con el metodo refortorial 
              if(mostrar.isDirectory()) {
                   listarFichero(mostrar); 
              }
                  
          }
          
      
          
      }}
}