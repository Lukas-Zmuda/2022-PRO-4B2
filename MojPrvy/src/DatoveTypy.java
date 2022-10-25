
public class DatoveTypy {

	public static void main(String[] args) {
		
		
		//deklaracia premennej
		int cislo;
		//inicializacia premennej
		cislo = 12;
		
		int x = 0;
		int y = 1, z = 2;
		
		int hex = 0xff;
		System.out.println("hex = " + hex);
		int bin = 0b10000000;
		System.out.println("bin = " + bin);
		int oct = 0123;
		System.out.println("oct = " + oct);
		
		
		byte bbyte = 12;
		int bint = bbyte;
		
		bbyte = (byte)bint;
		
		double dd = 12.89;
		System.out.println("dd = " + dd);
		
		int ddint = (int) dd;
		System.out.println("ddint = " + ddint);

		//desatinne cisla
		
		float ff = 12.444f;
		
		
		//znaky
		char zav = '@';
		System.out.println(zav);
		
		zav = 64;
		System.out.println(zav);
		
		char uni = '\u0123';
		System.out.println(uni);
	}

}
