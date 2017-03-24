package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarExcep {

	public static FileWriter abrirFichero(String ruta){
		try{ 
			return new FileWriter(ruta); 
			} catch (IOException ioex) { 
				// Aquí capturamos cualquier excepción IOException que se lance 
				ioex.printStackTrace(); 
				return null; }
	}
		
	

	public static void main(String[] args)  {
		int doble = 0;
		boolean error;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ruta del fichero");
		String ruta=sc.nextLine();
		FileWriter fichero=abrirFichero(ruta);
		System.out.println("Texto a introducir");
		String texto=sc.nextLine();
	
		try {
			fichero.write(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			fichero.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}