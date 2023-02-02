
public class Cykly {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");			
		}
		
		for(int i = 1; i < 11; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		for(int i = 10; i >= 0; i -= 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(int i = 1; i <= 11; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(int i = 1; i <= 128; i *= 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		int j = 10; 
		while(j < 5) {
			System.out.println("Ahoj");
			j++;
		}
		
		j = 10;
		do {
			System.out.println("Ahoj");
			j++;
		}while(j < 5);
		
		
		j = 1;
		while(true) {
			System.out.print(j + " ");
			j++;
			if(j == 6) {
				j++;
				continue;
			}
			if(j == 11) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("Program pokracuje dalej... ");
	}

}
