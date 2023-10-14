
public class Bingo {

	public static void main(String[] args) {
		int bola1 = (int) (Math.floor(Math.random()*80)+1);
		int bola2 = (int) (Math.floor(Math.random()*80)+1);
		
		while (bola1 == bola2)
			bola2 = (int) (Math.floor(Math.random()*80)+1);
		
		System.out.println("Bola 1: " + bola1);
		System.out.println("Bola 2: " + bola2);

	}

}
