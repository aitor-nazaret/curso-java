
public class Variables {

	public static void main(String[] args) {
		
		double precio;
		double iva;
		double total;
		
		precio = 499.99;
		iva= precio * 0.21;
		total = precio + iva;
		
		System.out.println("El precio sin IVA es " + precio + " euros");
		System.out.println("El IVA es " + iva + " euros");
		System.out.println("El precio con IVA es " + total + " euros");
	}

}
