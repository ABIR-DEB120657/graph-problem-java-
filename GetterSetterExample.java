class Students {
	String Name;
	private int Roll;
	private double Cgpa;
	char Section;
	void print() {
		System.out.println("Name = " + Name + "\n" + "Roll = " + Roll + "\n" + "CGPA = " + Cgpa + "\n" + "Section = " + Section + "\n");
	}
	int getRoll() {
		return Roll;
	}
	void setRoll(int x ){
	    Roll =x;
	}
	    
	double getCgpa() {
		return Cgpa;
	}
	void setCgpa(double y){
	    Cgpa = y;
	}
}

public class Main {
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.Name = "Abir deb";
		s1.setRoll(8969);
		s1.setCgpa(3.90);
		s1.Section ='A';
	//	s1.print();
		System.out.println(s1.getRoll());
		System.out.println(s1.getCgpa());
		System.out.println(s1.Name);
		System.out.println(s1.Section);

	}
}