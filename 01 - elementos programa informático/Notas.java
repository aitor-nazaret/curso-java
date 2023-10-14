
public class Notas {

	public static void main(String[] args) {
		int nota = 3;
		String notaTexto;
		if ( nota == 10)
			notaTexto = "Sobresaliente";
		else
			if ( nota >= 8 )
				notaTexto = "Notable";
			else
				if ( nota == 7 )
					notaTexto = "Bien";
				else
					if ( nota >= 5 )
						notaTexto = "Suficiente";
					else
						if ( nota >= 3)
							notaTexto = "Mal";
						else
							notaTexto = "Muy mal";
		
		System.out.println("Tu nota es: " + notaTexto);
			

	}

}
