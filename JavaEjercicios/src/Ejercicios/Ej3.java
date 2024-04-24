package Ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int max=10;
		boolean rta=false;
		Scanner lector = new Scanner(System.in);
		String[] palabras = new String[max];
		
		for(int i=0;i<palabras.length;i++) {
			System.out.print("Ingrese la palabra ["+i+"]: ");
			palabras[i]=lector.nextLine();
		}
		
		System.out.println();
		System.out.print("Ingrese palabra a comparar: ");
		String palabra = lector.nextLine();
		
		for(int i=0;i<palabras.length;i++) {
			if (palabras[i].equalsIgnoreCase(palabra)) {
				rta=true;
				break;
			}
		}
		
		System.out.println();
		if (rta) {
			System.out.println("Está en el array");
		}
		else {
			System.out.println("No está en el array");
		}
		
		lector.close();
	}

}
