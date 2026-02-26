import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int[] x = new int [11];
		for (int i = 0;i<11;i++){
		  int n = ab.nextInt();
	      x[i]=n;
		}
		for (int i =0 ; i<11;i++){
		    System.out.print(x[i] +" ");
		}
	}
}