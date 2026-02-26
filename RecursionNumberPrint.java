import java.util.Scanner;
public class Main {
	static int a;
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("enter your number : ");
		a = ab.nextInt();
		abir(a,0);
	}
	public static int abir(int a, int z ){
		if(z>a) return 0;
		System.out.print(a-z);
		return abir(a,z+1);
		
	}
}