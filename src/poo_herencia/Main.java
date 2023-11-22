package poo_herencia;

public class Main {

	public static void main(String[] args) {
		
		Desarrollador desarrolladorUno = new Desarrollador("Juan", 28, "Java");
		
		desarrolladorUno.programar();
		
		desarrolladorUno.trabajar();
		
		Gerente gerenteUno = new Gerente("Marcos", 29, "Ventas");
		
		gerenteUno.trabajar();
		
		gerenteUno.dirigir();

	}

}
