package Ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int max=10;
		Scanner lector = new Scanner(System.in);
		String[] palabras = new String [max];
		
		for(int i=0;i<palabras.length;i++) {
			System.out.println("Escriba la palabra["+i+"]: ");
			palabras[i]=lector.nextLine();
		}
		
		System.out.println();
		
		for(int j=palabras.length-1;j>=0;j--) {
			System.out.println("Palabra["+j+"]: "+palabras[j]);
		}
		
		lector.close();
	}
}
