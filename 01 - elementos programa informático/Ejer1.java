
public class Ejer1 {

	public static void main(String[] args) {
		int grados = 60;
		double coseno;
		double radianes = Math.toRadians(grados);
		radianes = grados * Math.PI / 180;
		coseno = Math.cos(radianes);		
		
		System.out.println("El coseno es: " + coseno);
		
		/*int num1=12, num2=77;
		int mayor = Math.max(num1, num2);
		System.out.println("El mayor es " + mayor);
		*/

	}

}
