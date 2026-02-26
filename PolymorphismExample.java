class vehicles {
	void start() {
		System.out.println("Now we know vehicles sound");
	}
}
class car extends vehicles {
	@Override
	void start() {
		super.start();
		System.out.println("car sound is = hunk hunk");
	}
}
class bike extends vehicles {
	@Override
	void start() {
		super.start();
		System.out.println("bike sound is = boom boom bomm");
	}
}
class bus extends vehicles {
	@Override
	void start() {
		super.start();
		System.out.println("bus sound is =  boo boo");
	}
}
public class Main {
	public static void main(String[] args) {
		car c = new car();
		c.start();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		bike b = new bike();
		b.start();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		bus d = new bus();
		d.start();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");


	}
}