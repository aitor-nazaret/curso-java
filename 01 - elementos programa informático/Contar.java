
public class Contar {

	public static void main(String[] args) {
		String parrafo ="En un lugar de la Mancha de cuyo\r\n"
				+ "nombre no quiero acordarme,\r\n"
				+ "no ha mucho tiempo que vivía\r\n"
				+ "un hidalgo' de los de lanza en\r\n"
				+ "astillero', adarga antigua, rocín\r\n"
				+ "flaco y galgo corredor. U na olla\r\n"
				+ "de algo más vaca que carnero, salpicón' las más\r\n"
				+ "noches, duelos y quebrantos' los sábados, lintejas los viernes, algún palomino de añadidura\r\n"
				+ "los domingos, consumían las tres partes' de su\r\n"
				+ "hacienda. El resto della concluían sayo de\r\n"
				+ "velarte', calzas de velludo' para las fiestas con\r\n"
				+ "sus pantuflos de lo mismo, y los días de entre\r\n"
				+ "semana se honraba con su vellod' de lo más\r\n"
				+ "fino. AAaaaaaaa";

		int contador = 0;
		int contador1 = 0;
		for(int i=0; i < parrafo.length(); i++) {
			if ( parrafo.charAt(i) == 'a')
				contador = contador + 1;
			if ( parrafo.charAt(i) == 'A')
				contador1 = contador1 + 1;
		}
		System.out.println("Cantidad a: " + contador);
		System.out.println("Cantidad A: " + contador1);
	}

}
