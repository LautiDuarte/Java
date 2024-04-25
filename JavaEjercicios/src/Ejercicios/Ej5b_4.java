package Ejercicios;

import java.util.Scanner;
import java.util.ArrayList;


public class Ej5b_4 {

	public static void main(String[] args) {
		int max=20;
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese número: ");
		Integer nro=Integer.parseInt(lector.nextLine());
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i=0;i<max;i++) {
			System.out.print("Ingrese número["+(i+1)+"]: ");
			Integer num = Integer.parseInt(lector.nextLine());
			if(num>nro) {
				numeros.add(num);
			}
		}
		System.out.println();
		System.out.println("Los números mayores al primer ingresado son: ");
		System.out.println(numeros);
		
		lector.close();

	}

}