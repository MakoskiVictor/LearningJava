import javax.swing.JOptionPane;

public class AreaCirculo {

	public static void main(String[] args) {
		// Solicitar al usuario que ingrese el radio del circulo (Pi * r*r)
		
		String radioStr = JOptionPane.showInputDialog("Ingrese el radio del circulo ");
		
		// Convertir el valor ingresado a uno valido
		
		double radio = Double.parseDouble(radioStr);
		
		// Verificar si se ingresó un valor valido
		
		if (radio <= 0) {
			JOptionPane.showMessageDialog(null, "Ingrese un valor valido para el radio.");
		} else {
			double area = calcularArea(radio);
			mostrarResultado(area);
			
		}
		

	}
	
	private static double calcularArea (double radio) {
		return Math.PI * (Math.pow(radio, 2));
	}
	
	private static void mostrarResultado (double area) {
		String mensaje = "El área del círculo es: " + area;
		
		JOptionPane.showInternalMessageDialog(null, mensaje);
	}

}
