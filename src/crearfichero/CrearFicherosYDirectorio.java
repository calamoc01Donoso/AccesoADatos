package crearfichero;
import java.io.*; 
public class CrearFicherosYDirectorio {

	public static void main(String[] args) {
		File ruta = new File (".");
		// objeto directorio  clase file 
		File directorio =  new File (ruta, "prueba"); 
		
		//creamos el directorio 
		directorio.mkdir(); 
		
		// objeto archivo de la clase file 
		File archivo1 = new File (directorio, "texto1.txt"); 
		File archivo2 = new File (directorio, "texto2.text"); 
		
		// crear los archivos 
		try {
			
			if((archivo1.createNewFile()) ||( archivo2.createNewFile())) {
				System.out.println("Se ha creado el archivo"); 
				
			}else {
				System.out.println("No se ha podido crear el archivo"); 
			}
			
		}catch(FileNotFoundException fe) {
			System.out.println("No se encontro archivo"); 
		}catch(IOException e) {
			System.out.println("Error de entrada / salida"); 
		}
		
		// renombrar los archivos 
		archivo1.renameTo(new File (directorio, "texto1.dat")); 
		System.out.println("Se ha cambiado "+archivo1+" a texto1.dat"); 
	}

}
