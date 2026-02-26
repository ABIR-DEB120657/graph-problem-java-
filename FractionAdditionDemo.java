class fraction {
	int numerator;
	int denominator;
	fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	void print() {
		//law
		// a/b + c/d = (ad +bc)/bd
		//a = this.numerator
		//b = this.denominator
		//c = f.numerator
		//d = f.denominator
		System.out.println(numerator + "/" + denominator);
	}
	fraction sum(fraction f) {
		int newnumerator = (this.numerator * f.denominator) + (this.denominator * f.numerator);
		int newdenominator = this.denominator * f.    denominator;
		return new fraction(newnumerator, newdenominator);
	}
}
public class Main {
	public static void main(String[] args) {
		fraction f1 = new fraction(16, 32);
		fraction f2 = new fraction(4, 16);
		//	f1.print();
		//	f2.print();
		fraction result = f1.sum(f2);
		result.print();


	}
}