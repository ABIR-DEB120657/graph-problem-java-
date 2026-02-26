class animal {
	String name;
	void age() {
		System.out.println(name+"<<this pet age is =  18");
	}
	void eat() {
		System.out.println(name+"<<this pet eat only = fish");
	}
	void sleep(){
	    System.out.println(name+"<<this pet sleep only 2 hour ");
	}
}
	class dog extends animal{
	    void bark(){
	    
	    System.out.println(name+"<<this pet barking sound is = bhou bhou");
	}
	}

	public class Main {
		public static void main(String[] args) {
			dog d1 = new dog();
			d1.name = " tommy";
			d1.age();
			d1.eat();
			d1.sleep();
			d1.bark();
			


		}
	}