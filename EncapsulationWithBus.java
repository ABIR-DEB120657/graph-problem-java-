class Bus {
	String BusName;
	int SeatNumbers;
	double BusSpeed;
	private double EngineSpeed = 150.90;
	char EngineNumberLastDigit;
	private void print() {
		System.out.println("Bus name = " + BusName + "\n" + " Seat numbers = " + SeatNumbers + "\n" + "Bus speed = " + BusSpeed + "\n" + "Engine speed = " + EngineSpeed + "\n" + "Engine number last digit = "
						   + EngineNumberLastDigit + "\n");
	}
	public void show() {
		print();
	}
}
public class Main {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		//default value ptint
		System.out.println("===============■■DEFAULT VALUE PRINT■■===============");
		b1.show();
		b1.BusName = " SI ";
		b1.SeatNumbers = 56;
		b1.BusSpeed = 133.90;
		b1.EngineNumberLastDigit = 'H';
		System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
		b1.show();

		Bus b2 = new Bus();
		System.out.println("===============■■DEFAULT VALUE PRINT■■===============");
		b2.show();
		b2.BusName = "zenin";
		b2.SeatNumbers = 45;
		b2.BusSpeed = 140.90;
		b2.EngineNumberLastDigit = 'A';
		System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
		b2.show();

		Bus b3 = new Bus();
		System.out.println("===============■■DEFAULT VALUE PRINT■■===============");
		b3.show();
		b3.BusName = "ovi motors";
		b3.SeatNumbers = 56;
		b3.BusSpeed = 155.90;
		b3.EngineNumberLastDigit = 'E';
		System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
		b3.show();



	}
}