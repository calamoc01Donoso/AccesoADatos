package escribirFichero;

import java.io.*; 
public class EscribirFicherosFileWriteArray {

	public static void main(String[] args) {
		File ruta = new File (".", "mitexto.txt");  // ruta del fichero 
				
		try {
			
			//el parametro true nos permite añadir mas datos a fichero sin borrar lo que teniamos 
			FileWriter escribir =  new FileWriter(ruta, true);
			// cremos  array de String 
			String textoArray[] = {"Albacete ", " Avila ", " Badajoz ", " Sevilla ", " Caceres "}; 
						
			// recorremos por cada  posicion la cadena 
			for(int i = 0; i<textoArray.length; i++) {
				escribir.write(textoArray[i]);
			}
			System.out.println("Se ha escrito en el documento"); 
			escribir.append("*"); // añadimos al final un * 
			escribir.close();//cerramos programas 
			
		}catch(IOException e){
			
			System.out.println("Error: Entrada y Salida"+e.getMessage()); 
		}
		
		
		
		
	}

}
