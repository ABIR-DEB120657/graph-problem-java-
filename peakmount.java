public class Main {
	public static void main(String[] args) {
	//	int [] abir = {0,2,1,0};
	//    int[] abir = {0,1,0};
	    int[] abir = {0,10,5,2};
		int n = abir.length;
		int peak =0;
		if(n>=3){
		    for(int i =0;i<n-1;i++){
		        if(abir[i]>abir[i+1] && abir[i]>abir[i-1]){
		            peak = abir[i];
		            System.out.println("peak value is : "+peak);
		        }
		    }
		}
	}
}