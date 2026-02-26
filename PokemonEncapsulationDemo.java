class pokemon {
	private int power;
	String type;
	pokemon(String type, int power) {
		this.type = type;
		this.power = power;
	}
	int getpower() {
		return power;
	}
	void setpower(int power){
	    this.power= power;
	}
	
	void print() {
		
		System.out.println(" power =  " + power + " type = " + type);
	}
}

public class Main {
	public static void main(String[] args) {
		pokemon p1 = new pokemon("water", 112);
		p1.type = "current"; //change string
		p1.setpower(123); //ata access kora jabe na
//	System.out.println(p1.getpower());
		p1.print();

	}
}