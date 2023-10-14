import java.util.Scanner;

public class PedirNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println("Escribe un número:");
		int num = scanner.nextInt();
		System.out.println("Tu número es: " + num);
		
		for (int i = 1 ; i <= num ; i++ )
			System.out.println("Número " + i);

	}

}
