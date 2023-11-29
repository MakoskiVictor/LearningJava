package poo_herencia;

public class Empleado {

	private static int contadorId = 0;
	private int id;
	
	private String nombre;
	private int edad;
	
	public Empleado (String nombre, int edad) {
		this.id = ++contadorId;		
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//public abstract void trabajar () {}
	
	public void trabajar () {
		System.out.println("Realizando tareas generales");
	}
	
	public int getId () {
		return id;
	}
	
	public String getName () {
		return nombre;
	}
	
	
}
