class cse {
	int batch;
	//anyone can change this static
//	static String department = "cse";
//now we make it private no one can not change it
	private static String department = "cse";
	private int studentid;
	private int studentnumbers;
	cse(int batch, int studentid, int studentnumbers) {
		this.batch = batch;
		//	this.department = department;
		this.studentid = studentid;
		this.studentnumbers = studentnumbers;
	}
	int getstudentid() {
		return studentid;
	}
	int getstudentnumbers() {
		return studentnumbers;
	}
	void setstudentid(int studentid) {
		this.studentid = studentid;
	}
	void setstudentnumbers(int studentnumbers) {
		this.studentnumbers = studentnumbers;
	}
	void print() {
		System.out.println(" 1. Batch = " + batch);
		System.out.println(" 2. department = " + department);
		System.out.println(" 3. Studentid = " + studentid);
		System.out.println(" 4. studentnumbers= " + studentnumbers);
	}
}

public class Main {
	public static void main(String[] args) {
		cse s1 = new cse(18, 101024, 38);
//now we change one deapartment and change all department bcz we use static
		//s1.department = "eee";
		//now we private it  no one can not change it
		cse s2 = new cse(18, 101025, 38);
		cse s3 = new cse(17, 111125, 40);
		s1.print();
		s2.print();
		s3.print();

	}
}