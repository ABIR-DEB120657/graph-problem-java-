class parents {
	int salary = 50505050;
	parents(int salary) {
		this.salary = salary;
	}
}
class son extends parents {
	son() {
		super(50505050);
	}
	void changesalary() {
		super.salary = 7890;
	}
	void showsalary() {
		System.out.println("now parents salary is = " + salary);
	}
}
public class Main {
	public static void main(String[] args) {
		son s1 = new son();
		s1.changesalary();
		s1.showsalary();


	}
}