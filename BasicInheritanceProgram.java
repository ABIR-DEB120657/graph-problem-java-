class vehicles {
	void start() {
		System.out.println(" Abir is mother fucker");
	}
}
class car extends vehicles {
	void hunk() {
		System.out.println("car start sound is hunk");
	}
}
class bike extends vehicles {
	void kickstart() {
		System.out.println("bike start sound is boom boom");
	}
}
class bus extends vehicles {
	void vuvu() {
		System.out.println("bus start sound is vuuu vuuu");
	}
}
public class Main {
	public static void main(String[] args) {
		bike b = new bike();
		b.start();
		b.kickstart();

		car c = new car();
		c.start();
		c.hunk();

		bus d = new bus();
		d.start();
		d.vuvu();



	}
}