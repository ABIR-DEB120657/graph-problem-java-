public class Main {
	public static class Dog {
		void Speak() {
			System.out.println("dog sound = " + "bhau bhau");
		}
	}
	public static class Cat {
		void Speak() {
			System.out.println("cat sound = " + "meow meow");
		}
	}
	public static class Tiger {
		void Speak() {
			System.out.println("Tiger sound =" + "halum halum");
		}
	}
	public static class Human {
		void Speak() {
			System.out.println("human sound  = " + " hello ");
		}
	}

public static void main(String[] args) {
	Dog d = new Dog();
	Cat c = new Cat();
	Tiger t = new Tiger();
	Human h = new Human();

	d.Speak();
	c.Speak();
	t.Speak();
	h.Speak();

}
}