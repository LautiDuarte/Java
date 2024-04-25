package Ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import Entidades.empleado;
import Entidades.administrativo;
import Entidades.vendedor;

public class Ej5b_5 {
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		int max = 20;
		ArrayList<empleado> lista = new ArrayList<>();
		while(lista.size()<max){
			System.out.print("¿Desea ingresar un administrativo o un vendedor?: ");
			String rta=leer.nextLine();
			if (rta.equalsIgnoreCase("a")){
				administrativo a = new administrativo();
				cargaDatosComunes(a);
				System.out.print("Ingrese horas del mes: ");
				((administrativo)a).setHsMes(Integer.parseInt(leer.nextLine()));
				System.out.print("Ingrese horas extra: ");
				((administrativo)a).setHsExtra(Integer.parseInt(leer.nextLine())); 
				lista.add(a);
				
			}
			else {
				vendedor v = new vendedor();
				cargaDatosComunes(v);
				System.out.print("Ingrese porcentaje de comisiones: ");
				((vendedor)v).setPorcenComisiones(Float.parseFloat(leer.nextLine()));
				System.out.print("Ingrese total de ventas: ");
				((vendedor)v).setTotalVentas(Integer.parseInt(leer.nextLine()));
				lista.add(v);
			}
			if(lista.size()!=max) {
			System.out.print("¿Continua ingresando?(Y/N): ");
			String cont=leer.nextLine();
				if (cont.equalsIgnoreCase("n")){
					break;
				}
			}
		}
		System.out.println();
		for (empleado unempleado: lista) {
			System.out.println(unempleado.getDetalle());
			System.out.println();
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
