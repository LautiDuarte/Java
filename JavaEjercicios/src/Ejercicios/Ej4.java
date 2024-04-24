package Ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int max=5;
		int n=0;
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese número: ");
		Integer nro=Integer.parseInt(lector.nextLine());
		Integer[] numeros = new Integer[max];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Ingrese número["+i+"]: ");
			Integer num = Integer.parseInt(lector.nextLine());
			if(num>nro) {
				numeros[n] = num;
				n++;
			}
		}
		System.out.println();
		System.out.println("Los números mayores al primer ingresado son: ");
		for(int i=0;i<n;i++) {
			System.out.println("Número["+i+"]: "+numeros[i]);
		}
		
		lector.close();

	}

}
