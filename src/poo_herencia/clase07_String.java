package poo_herencia;

import java.util.Scanner;

public class clase07_String {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Solicitar al user que ingrese su nombre
		
		System.out.print("Ingrese su nombre: ");
		
		String nombre = scanner.nextLine();
		
		// Mostrar el nombre ingresado
		
		System.out.println(nombre);
		
		// Obtener la longitud del nombre
		
		int longitudNombre = nombre.trim().length(); // trim corta los espacios de los extremos
		
		System.out.println("La longitud del nombre es: " + longitudNombre);
		
		// Verificar si el nombr contiene una letra especifica
		
		System.out.print("Ingrese una letra para buscar: ");
		String letra = scanner.nextLine();
		
		if (nombre.toLowerCase().contains(letra.toLowerCase())) {
			System.out.println("El nombre contiene la letra: " + letra);
		} else {
			System.out.println("El nombre NO contiene la letra: " + letra);
		}
		
		// Obtener apellido
		
		System.out.print("Ingrese su apellido: ");
		String apellido = scanner.nextLine();
		
		// Concatenar nombre
		
		String nombreCompleto = nombre + " " + apellido;
		
		// Comparar nombre ingresado con otro nombre
		System.out.print("Ingrese otro nombre para comparar: ");
		String otroNombre = scanner.nextLine();
		
		if (nombre.equalsIgnoreCase(otroNombre)) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres No son iguales");
		}
		

	}

}
