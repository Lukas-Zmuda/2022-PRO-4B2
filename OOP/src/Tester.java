
public class Tester {

	public static void main(String[] args) {
		
		int a = 15;
		
		Student s = new Student();

		s.meno = "Fero";
		s.priezvisko = "Mrkva";
		s.vek = 15;
		
		Student s2 = new Student();
		s2.meno = "Jan";
		s2.priezvisko = "Hrasko";
		s2.vek = 23;
		
		s2.celeMeno();		
		s.celeMeno();
		
		s.kompletInfo();

	}

}
