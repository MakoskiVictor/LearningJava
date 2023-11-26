package poo_herencia;

public class Main {

	public static void main(String[] args) {
		
		//Desarrollador desarrolladorUno = new Desarrollador("Juan", 28, "Java");
		
		//desarrolladorUno.programar();
		
		//desarrolladorUno.trabajar();
		
		//Gerente gerenteUno = new Gerente("Marcos", 29, "Ventas");
		
		//gerenteUno.trabajar();
		
		//gerenteUno.dirigir();
		
		Empleado[] empleados = new Empleado[3];
		
		empleados[0] = new Gerente("Juan", 35, "ventas");
		empleados[1] = new Desarrollador("Maria", 40, "Cobol");
		empleados[2] = new Gerente("Mario", 22, "Maketing");
		
		for (Empleado empleado : empleados) {
			System.out.println("ID: " + empleado.getId() + ", Nombre de la clase: " + empleado.getClass().getSimpleName());
			System.out.println("Nombre del empleado: " + empleado.getName());
			empleado.trabajar();
			
			if ( empleado instanceof Gerente) {
				((Gerente) empleado).dirigir();
			} else if (empleado instanceof Desarrollador) {
				((Desarrollador) empleado).programar();
			}
		}
		
		//Casting Implicito
		int a = 10;
		
		long b = a;  //Conversion implícita
		
		// CASTING EXPLICITO
		double c = 10.5;
		
		int d = (int) c;
		System.out.println(d);
		
		//PROMOCION DE TIPOS
		
		int e = 10;
		
		double f = 20.5;
		
		double result = e * f;
		
		System.out.println(result);

	}

}
