package LeerFicheros;

/***
 * @author Celia Álamo Calle 
 * @description: Hacer lo mismo que el ejercicio anterior pero usando  
 * FileReader con read() sin parametrizar 
 */

import java.io.*;

public class LeerFicheroFileReader {

	public static void main(String[] args) {
		String archivo = "mitexto.txt"; 
        File fichero = new File (".", archivo);
         
        try (FileReader lector1 = new FileReader(fichero)) {
            int conversortext;//conversor de texto 
            char caracter;     
            
            // Mientras haya un carácter para leer (diferente de -1)
            while ((conversortext= lector1.read()) != -1) {
            	// Convertimos el conversor tipo int a char
                caracter = (char) conversortext; 
             }
            lector1.close();
            
        } catch (IOException e) {
            System.err.println("no se puede leer : " + e.getMessage());
        }

	}

}
