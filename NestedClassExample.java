public class Main {
	private static class Pokemon {
		String name;
		String power;
		String type;
		double hp;
		int speed;
		int defense;
		int attack;
		void print() {
			System.out.println(" ● Name =" + name + " ● power = " + power + " ● Type = " + type + "Hp = " + hp + "Speed = " + speed +
								 "Defense = " + defense + "Attack = " + attack );
		}
	}

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon();
		p1.name = "pikachu";
		p1.power = "electicity";
		p1.type = "water";
		p1.hp = 110;
		p1.speed = 70;
		p1.defense = 80;
		p1.attack = 90;
		Pokemon p2 = new Pokemon();
		p2.name = "charizard";
		p2.power = "fire";
		p2.type = "air";
		p2.hp = 200.90;
		p2.speed = 70;
		p2.defense = 90;
		p2.attack = 110;
		Pokemon p3 = p1;
		p3.type = "water";
		System.out.println(p1.type);
		p1.print();


	}
}