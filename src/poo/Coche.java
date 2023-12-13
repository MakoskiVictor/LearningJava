package poo;

public class Coche {
	
	// EL PRIVATE ES PARA QUE LOS ATRIBUTOS NO PUEDAN SER MODIFICADOS SALVO POR 
	// UN METODO DE LA MISMA FN (PRINCIPIO DE ENCAPSULAMIENTO)
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	public Coche () {
		//ruedas, largo, ancho, motor, peso
		//this.ruedas = ruedas;
		//this.largo = largo;
		//this.ancho = ancho;
		//this.motor = motor;
		//this.peso = peso;
		
		this.setRuedas(4);
		this.setLargo(3);
		this.setAncho(2);
		this.setMotor(3000);
		this.setPeso(2500);
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
