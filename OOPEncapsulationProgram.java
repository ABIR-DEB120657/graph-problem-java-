class parents {
	private int salary = 60606060;
	parents(int salary){
	    this.salary=salary;
	}
	void setsalary(int salary) {
		this.salary = salary;
	}

	int getsalary() {
		return salary;
	}
}
class son extends parents {
	son() {
		super(60606060);
	}
	void changesalary() {
		super.setsalary (7080);
	}
	void showsalary() {
		System.out.println("now the salary is = " + getsalary());
	}
}


public class Main {
	public static void main(String[] args) {
		son s1 = new son();
		s1.changesalary();
		s1.showsalary();


	}
}