import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		String x = ab.nextLine();
		int n = x.length();
		System.out.println("your input length is : "+n);
		if(n>=4){
		System.out.print(x.charAt(5-1));
		}
		else{
		    System.out.print("your input is very low length is low smaller than 4 ");
		}
		
	}
}