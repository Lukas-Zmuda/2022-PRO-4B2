
public class Student {
	
	//instancne premenne
	String meno;
	String priezvisko;
	int vek;

	//metody
	void celeMeno() {
		System.out.println(meno + " " + priezvisko);
	}
	
	void kompletInfo() {
		System.out.println("Meno: " + meno );
		System.out.println("Priezvisko: " + priezvisko);
		System.out.println("Vek: " + vek);
	}

}
