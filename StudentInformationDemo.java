class Students {
	String name;
	int roll;
	private char section = 'A';
	double cgpa;
	void print() {
		System.out.println("Name = " + name + "\n" + "Roll = " + roll + "\n" + "Section = " + section + "\n" + "CGPA = " + cgpa + "\n");
	}
}

public class Main {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.name = "Abir deb ";
		s1.roll = 1234;
		s1.cgpa = 3.98;
		//add design
		System.out.println("========================□□□□□=============================");
		s1.print();
		Students s2 = new Students();
		s2.name = " rafi ";
		s2.roll = 4321;
		s2.cgpa = 4.00;
		System.out.println("========================□□□□□=============================");
		s2.print();
		Students s3 = new Students();
		s3.name = "Bashu deb kumar paul ";
		s3.roll = 54321;
		s3.cgpa = 3.99;
		System.out.println("========================□□□□□=============================");
		s3.print();
		//default  value print
		Students s4 = new Students();
		System.out.println("========================□□□□□=============================");
		s4.print();
		//add value(remove default value)
		s4.name = "sojib Ahamed";
		s4.roll = 78584;
		s4.cgpa = 4.00;
		System.out.println("========================□□□□□=============================");
		s4.print();



	}
}