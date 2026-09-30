package LeerFicheros;

/***
 * @author Celia Álamo Calle 
 * @description: Hacer lo mismo que el ejercicio anterior pero usando  el char con el read(parametrizado)
 *  con FileReader
 */

import java.io.*;

public class LeerFicheroFileReadChar {

	public static void main(String[] args) {
		String archivo = "mitexto.txt"; 
        File fichero = new File (".", archivo);
         
        try (FileReader lector2 = new FileReader(fichero)) {
            int conversortext;//conversor de texto 
            char caracter [] = new char [20];    
            
            // Mientras haya un carácter para leer (diferente de -1)
            while ((conversortext= lector2.read(caracter)) != -1) {
            	// Convertimos el conversor tipo int a char
                 System.out.print(caracter); 
          }
            lector2.close();
            
        } catch (IOException e) {
            System.err.println("no se puede leer : " + e.getMessage());
        }

	}

}
