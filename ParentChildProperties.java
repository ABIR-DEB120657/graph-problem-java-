class parents {
	int money = 10101010;
	int housenumbers = 545;
	int propertyprice = 60708090;
	int cars = 10;
	String home = " new work";
}
class child extends parents {
	String companyname = "BMW";
	void show() {
		System.out.println("money = " + super.money);
		System.out.println("housenumbers = " + super.housenumbers);
		System.out.println("propertyprice = " + super.propertyprice);
		System.out.println("cars = " + super.cars);
		System.out.println(" home = " + super.home);
		System.out.println(" companyname = " + companyname);
	}
}

public class Main {
	public static void main(String[] args) {
		child c1 = new child();
		c1.show();

	}
}