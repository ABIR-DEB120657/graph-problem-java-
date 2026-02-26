import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		int [] x = new int [4];
		for(int i =0;i<4;i++){
		    int y = ab.nextInt();
		    x[i]=y;
		}
		for(int i =0;i<4;i++){
		    System.out.println(2*x[i]+" ");
		}
	}
}