package Ejercicios;

import java.util.Scanner;
import Entidades.empleado;
import Entidades.administrativo;
import Entidades.vendedor;

public class Ej5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int max = 20;
		empleado[] lista = new empleado[max];
		for(int i=0;i<max;i++) {
			System.out.println("¿Desea ingresar un administrativo o un vendedor?: ");
			String rta=leer.nextLine();
			if (rta.equalsIgnoreCase("a")){
				/* System.out.print("Ingrese dni: ");
				persona.setDni(Integer.parseInt(leer.nextLine()));
				System.out.print("Ingrese nombre: ");
				persona.setNombre(leer.nextLine());
				System.out.print("Ingrese apellido: ");
				persona.setApellido(leer.nextLine());
				System.out.print("Ingrese email: ");
				persona.setEmail(leer.nextLine());
				System.out.print("Ingrese sueldo base: ");
				persona.setSueldoBase(Float.parseFloat(leer.nextLine()));
				System.out.print("Ingrese horas del mes: ");
				persona.setHsMes(Integer.parseInt(leer.nextLine()));
				System.out.print("Ingrese horas extra: ");
				persona.setHsExtra(Integer.parseInt(leer.nextLine())); 
			*/
			}
			else {
				System.out.print("Ingrese dni: ");
				Integer dni = Integer.parseInt(leer.nextLine());
				System.out.print("Ingrese nombre: ");
				String nombre = leer.nextLine();
				System.out.print("Ingrese apellido: ");
				String apellido = leer.nextLine();
				System.out.print("Ingrese email: ");
				String email = leer.nextLine();
				System.out.print("Ingrese sueldo base: ");
				Float sueldoBase = Float.parseFloat(leer.nextLine());
				System.out.print("Ingrese porcentaje de comisiones: ");
				Float porcenComision = Float.parseFloat(leer.nextLine());
				System.out.print("Ingrese total de ventas: ");
				Integer totalVentas = Integer.parseInt(leer.nextLine());
				lista[i] = new vendedor(dni,nombre,apellido,email,sueldoBase,porcenComision,totalVentas);
			}
			System.out.print("¿Continua ingresando?(Y/N): ");
			String cont=leer.nextLine();
			if (cont.equalsIgnoreCase("n")){
				break;
			}
		}
		for (int j=0;j<max;j++) {
			lista[j].getDetalle();
		}
	leer.close();
	}

}
