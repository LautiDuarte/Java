package Ejercicios;

public class Ej1 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i+1);
		}
		System.out.println("");
		int n=0;
		int nro=0;
		while(n!=10) {
			if (0 != nro%2) {
				System.out.println(nro);
				n++;
			}
			nro++;
		}
	}
		
}

