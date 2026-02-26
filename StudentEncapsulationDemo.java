class student {
	String name;
	private int id;
	private double cgpa;
	private String fathername;
	private String mothername;
	private int fatherphonenumber;
	private int motherphonenumber;
	double semester;
	student(String name, int id, double cgpa, String fathername, String mothername, int fatherphonenumber, int motherphonenumber,double semester) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.fathername = fathername;
		this.mothername = mothername;
		this.fatherphonenumber = fatherphonenumber;
		this.motherphonenumber = motherphonenumber;
		this.semester = semester;
	}

	int getid() {
		return id;
	}
	double getcgpa() {
		return cgpa;
	}
	String getfathername() {
		return fathername;
	}
	String getmothername() {
		return mothername;
	}
	int getfatherphonenumber() {
		return fatherphonenumber;
	}
	int getmotherphonenumber() {
		return motherphonenumber;
	}

	void setid(int id) {
		this.id = id;
	}
	void setcgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	void setfathername(String fathername) {
		this.fathername = fathername;
	}
	void setmothername(String mothername) {
		this.mothername = mothername;
	}
	void fatherphonenumber(int fatherphonenumber) {
		this.fatherphonenumber = fatherphonenumber;
	}
	void motherphonenumber(int motherphonenumber) {
		this.motherphonenumber = motherphonenumber;
	}
	void print() {
		System.out.println(" 1. Name = " + name);
		System.out.println(" 2. ID = " + id);
		System.out.println(" 3. cgpa = " + cgpa);
		System.out.println(" 4. fathername = " + fathername);
		System.out.println(" 5. mothername = " + mothername);
		System.out.println(" 6. Father phone number = " + fatherphonenumber);
		System.out.println(" 7. mother phone number = " + motherphonenumber);
		System.out.println(" 8. semester = " + semester);
	}
}
public class Main {
	public static void main(String[] args) {
		student shadow = new student("Abir", 101024, 3.12, " RIPON KUMAR DEB ", "BONDONA DEB", 1715248090, 1715386120,2.41);
		//shadow.
		shadow.print();

	}
}