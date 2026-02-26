class fraction{
	int numerator;
	int denominator;
	fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	void print() {

		System.out.println("the fraction is = " + numerator + "/" + denominator);
	}
	fraction multi(fraction f){
	    int x1 = (numerator * numerator);
	    int x2 = (denominator * denominator);
	    return new fraction ( x1 ,x2);
	}
}
	public class Main {
		public static void main(String[] args) {
			fraction f1 = new fraction(12, 24);
			fraction f2 = new fraction(6, 12);
			fraction result = f1.multi(f2);
			result.print();

		}
	}