class father {
	void  property() {
		System.out.println(" my sons are motherchod");
	}
}
class son1 extends father {
	void property1() {
		System.out.println("i am the 1st owner of my father");
	}
}
class son2 extends father {
	void property2() {
		System.out.println(" i am the 2nd owner of my father");
	}
}

public class Main {
	public static void main(String[] args) {
		son1 s1 = new son1();
		s1.property();
		s1.property1();
		son2 s2 = new son2();
		s2.property();
		s2.property2();

	}
}