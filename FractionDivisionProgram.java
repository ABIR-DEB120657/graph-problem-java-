import java.util.Scanner;
class fraction {
	int numenator;
	int denomenator;
	fraction(int numenator, int denomenator) {
		this.numenator = numenator;
		this.denomenator = denomenator;

	}
	void print() {
		System.out.println("the fraction equation is = " + numenator + "/" + denomenator);
	}
	fraction division(fraction f) {
		int x1 = (this.numenator * f.denomenator);
		int x2 = (this.denomenator * f.numenator);
		int dip = 1;
		for (int i = 1 ; i <= x1 && i <= x2; i++) {
			if (x1 % i == 0 && x2 % i == 0) {
				dip = i;
			}
		}
		x1 = x1 / dip;
		x2 = x2 / dip;
		if (x1 == x2) {
			x1 = 1;
			x2 = 1;
		}


		return new fraction(x1, x2);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter 1st numenator number = ");
		int n1 = ab.nextInt();
		ab.nextLine();
		System.out.print("enter 1st denomenator number = ");
		int n2 = ab.nextInt();
		ab.nextLine();
		System.out.print("enter 2nd numenator number = ");
		int x1 = ab.nextInt();
		ab.nextLine();
		System.out.print("enter 2nd denomenator number = ");
		int x2 = ab.nextInt();
		ab.nextLine();
		if (n2==0 || x2 ==0) return ;
		fraction f1 = new fraction(n1, n2);
		fraction f2 = new fraction(x1, x2);
		fraction result = f1.division(f2);
		result.print();


	}
}
