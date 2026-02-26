class fraction {
	int numenator;
	int denomenator;
	fraction(int numenator, int denomenator) {
		this.numenator = numenator;
		this.denomenator = denomenator;
	}
	void print() {
		System.out.println("the fraction equation is = "+numenator + "/" + denomenator);
	}
	fraction division(fraction f) {
		int x1 = (this.numenator * f.denomenator);
		int x2 = (this.denomenator * f.numenator);
		return new fraction(x1, x2);
	}
}
public class Main {
	public static void main(String[] args) {
		fraction f1 = new fraction(12, 48);
		fraction f2 = new fraction(6, 26);
		fraction result = f1.division(f2);
		result.print();


	}
}