import java.util.Scanner;
public class Main {
	public static class Car{
	      String carName;
	      int serialNumber;
	      double price;
	      String type;
	      double speed;
	      char engineType;
	  public     void print(){
	      System.out.println(carName+" "+serialNumber+" "+price+" "+type+" "+speed+" "+engineType);
	      }
	}
	      
	public static void main(String[] args) {
		Scanner ab = new Scanner (System.in);
		Car BMW = new Car();
		System.out.print("enter car name : ");
		BMW.carName=ab.nextLine();
		System.out.println (" ");
		System.out.print("enter serial number : ");
		BMW.serialNumber =ab.nextInt();
		System.out.println(" ");
		System.out.print ("enter car price : ");
		BMW.price=ab.nextDouble();
		System.out.println("");
		System.out.print("enter car type : ");
		BMW.type=ab.nextLine();
		System.out.println("");
		System.out.print("enter car speed : ");
		BMW. speed=ab.nextDouble();
		System.out.println("");
		System.out.print("enter your engine type : ");
		BMW. engineType=ab.next().charAt(0);
		ab.nextLine();
		
		change(BMW );
		
		System.out.println("car name = "+BMW. carName+"\n"+"car price = "+BMW. price+"\n"+" Serial number = "+BMW. serialNumber+"\n"+"car type = "+BMW.type+"\n"+"car speed = "+BMW.speed+"\n"+"ENGINE TYPE = "+BMW. engineType);
		System.out.println(" ");
		System.out.print("we print method");
		BMW.print();
		
		
		
		
	}
	public static void change(Car x){
	      x.carName="audi";
	}
}