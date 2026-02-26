class  complex {
	int x ;
	int y;
	complex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void print() {
		if (y < 0) {
			System.out.println("This equation is = " + x + " - " + (-y) + "i ");
		} else {
			System.out.println("This equation is = " + x + " + " + y + "i ");
		}
	}
	//without return (bcz use void)
	void add(complex c) {
		int real = this.x + c.x;
		int imagine = this.y + c.y;
		if (imagine < 0) {
			System.out.println("This equation is = " + real + " - " + (-imagine) + "i ");
		} else {
			System.out.println("This equation is = " + real + " + " + imagine + "i ");
		}
	}

	void product(complex c) {
		int xx = (this.x * c.x) - (this.y * c.y);
		int yy = (this.x * c.y) + (this.y * c.x);
		if (yy < 0) {
			System.out.println("This equation is = " + xx + " - " + (-yy) + "i ");
		} else {
			System.out.println("This equation is = " + xx + " + " + yy + "i ");
		}
	}


}
public class Main {
	public static void main(String[] args) {
		complex c1 = new complex(3, 8);
		complex c2 = new complex(56, -9);
		c1.print();
		c2.print();
		//System.out.print("the sum is = ");
		c1.add(c2);
		//	System.out.println(" ");
		//	System.out.print("the product value is = ");
		c1.product(c2);


	}
}