package poo_herencia;

public class Gerente extends Empleado {
	
	private String departamento;
	
	public Gerente ( String nombre, int edad, String departamento) {
		
		super(nombre, edad);
		
		this.departamento = departamento;
	}
	
	public void dirigir () {
		System.out.println("Dirigienfo el departamento " + departamento);
	}


}
