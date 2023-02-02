
public class Pole {

	public static void main(String[] args) {
		
		int a = 10;
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[7];
		
		cisla[0] = 4;
		cisla[1] = cisla[0] + 1;
		cisla[2] = 6;
		
		System.out.println("Hodnota prveho prvku pola je " + cisla[0]);
		
		for(int i = 0; i < 7; i++) {
			System.out.print(cisla[i] + " ");
		}
		
		String[] mena4b = {"Samuel", "Dominik", "David", "Juraj", "Kristian", "Daniel", "Kristian"};
		System.out.println("\nPrvy v zozname je " + mena4b[0]);
		System.out.println("Pocet ziakov v zozname: " + mena4b.length);
		
		int[] vyska4b = {182, 176, 186, 175, 185, 187, 170};
		
		System.out.println("-----------");
		System.out.println("Vyska 4B2:");
		for(int i = 0; i < mena4b.length; i++) {
			System.out.println((i + 1) + ". " + mena4b[i] + ": " + vyska4b[i] + " cm");
		}
		
		
		

	}

}
