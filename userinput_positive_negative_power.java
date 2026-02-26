import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ab = new Scanner (System.in);
		System.out.println("enter your array size: ");
		int n = ab.nextInt();
		int [] x = new int [n];
		System.out.println("this arrays length is : "+x.length);
		System.out.println("enter arrays numbers");
		for (int i = 0;i<n;i++){
		    x[i]=ab.nextInt();
		}
		for(int i =0 ; i<n;i++){
		    int y = x[i];
		    if(y>=0){
		        System.out.println("the pissitive arrays are " + y+ "  the square values are "+y*y);
		}
	
	}
}
}