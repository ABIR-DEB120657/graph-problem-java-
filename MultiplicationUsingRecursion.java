import java.util.Scanner;

public class Main {
	static int a;
	static int b;
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.print("enter your 1st number = ");
		a = ab.nextInt();
		System.out.println(" ");
		System.out.print("enter your 2nd numbet = ");
		b = ab.nextInt();
		int result = abir(a,b);
		System.out.println("this 2 numbers multiply is = "+result);
		
	}
	public static int abir (int a,int b){
	    if(b==0) return 0;
	    return a+abir(a,b-1);
	    
	}
}