package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedExcep2 {

	public static FileWriter abrirFichero(String ruta) throws IOException{
		
			return new FileWriter(ruta); 
			
	}
		
	

	public static void main (String[] args) throws IOException{
		int doble = 0;
		boolean error;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ruta del fichero");
		String ruta=sc.nextLine();
		FileWriter fichero = null;
		try {
			fichero= abrirFichero(ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Texto a introducir");
		String texto=sc.nextLine();

		
			fichero.write(texto);
		
		
			fichero.close();
		
}
}
	