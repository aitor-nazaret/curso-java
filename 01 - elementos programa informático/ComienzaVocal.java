
public class ComienzaVocal {

	public static void main(String[] args) {
		String cadena="Hola mundo";
		
		if(cadena.startsWith("A") ||
		   cadena.startsWith("E") ||
		   cadena.startsWith("I") ||
		   cadena.startsWith("O") ||
		   cadena.startsWith("U") ||
		   cadena.startsWith("a") ||
		   cadena.startsWith("e") ||
		   cadena.startsWith("i") ||
		   cadena.startsWith("o") ||
		   cadena.startsWith("u")
		   )
			System.out.println("Comienza por vocal");
		else
			System.out.println("No comienza por vocal");
	}

}
