package Ejercicios;

import java.util.Scanner;
import Entidades.empleado;
import Entidades.administrativo;
import Entidades.vendedor;

public class Ej5a {
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		int max = 20;
		empleado[] lista = new empleado[max];
		for(int i=0;i<max;i++) {
			System.out.print("¿Desea ingresar un administrativo o un vendedor?: ");
			String rta=leer.nextLine();
			if (rta.equalsIgnoreCase("a")){
				lista[i]= new administrativo();
				cargaDatosComunes(lista[i]);
				System.out.print("Ingrese horas del mes: ");
				((administrativo)lista[i]).setHsMes(Integer.parseInt(leer.nextLine()));
				System.out.print("Ingrese horas extra: ");
				((administrativo)lista[i]).setHsExtra(Integer.parseInt(leer.nextLine())); 
			}
			else {
				lista[i] = new vendedor();
				cargaDatosComunes(lista[i]);
				System.out.print("Ingrese porcentaje de comisiones: ");
				((vendedor)lista[i]).setPorcenComisiones(Float.parseFloat(leer.nextLine()));
				System.out.print("Ingrese total de ventas: ");
				((vendedor)lista[i]).setTotalVentas(Integer.parseInt(leer.nextLine()));
			}
			System.out.print("¿Continua ingresando?(Y/N): ");
			String cont=leer.nextLine();
			if (cont.equalsIgnoreCase("n")){
				break;
			}
		}
		for (empleado empleado : lista) {
			System.out.println(empleado.getDetalle());
		}
	leer.close();
	}
	
	public static void cargaDatosComunes(empleado e) {
		System.out.print("ingrese dni: ");
		e.setDni(Integer.parseInt(leer.nextLine()));
		System.out.print("Ingrese nombre: ");
		e.setNombre(leer.nextLine());
		System.out.print("ingrese apellido: ");
		e.setApellido(leer.nextLine());
		System.out.print("Ingrese email: ");
		e.setEmail(leer.nextLine());
		System.out.print("Ingrese sueldo base: ");
		e.setSueldoBase(Float.parseFloat(leer.nextLine()));
		
	}

}
