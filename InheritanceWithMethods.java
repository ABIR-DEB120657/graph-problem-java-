class parents {
	int money = 10101010;
	void showmoney() {
		System.out.println("money amount is = " + money);
	}
}
class child extends parents {
	int toy = 500;
	void showtoy() {
		System.out.println(" the toy numbers are = " + toy);
	}
}


public class Main {
	public static void main(String[] args) {
		child c1 = new child();
		c1.showmoney();
		c1.showtoy();


	}
}