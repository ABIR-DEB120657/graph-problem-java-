//call parents class method
class parents {
	void display() {
		System.out.println("Fuck you my son");
	}
}
class child extends parents {
	void display() {
		System.out.println("give me money father");
	}
	void bothshow() {
		display();
		super.display();
	}
}

public class Main {
	public static void main(String[] args) {
		child c1 = new child();
		c1.bothshow();

	}
}