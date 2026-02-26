class grandfather {
	void land() {
		System.out.println("grandfather has land");
	}
}
class father extends grandfather {
	void car() {
		//	super.land();
		System.out.println("father has car");
	}
}
class son extends father {
	void bike() {
		System.out.println("son has bike");
	}
}
public class Main {
	public static void main(String[] args) {
		son s = new son();
		s.land();
		s.car();
		s.bike();


	}
}