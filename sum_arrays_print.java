public class Main {
	public static void main(String[] args) {
		int [] abir = {1,2,4,-5,-6,6,-4};
		int n =2;
   	int sum = 0;
		for(int i =0;i<abir.length;i++){
		    for (int j =1;j<abir.length;j++){
		        sum= abir[i]+abir[j];
		        if(sum==n){
		            System.out.println(abir[i]+"   +  "+abir[j]+"   = "+sum);
		            System.out.println("there index is = "+i+" "+j);
		        }
		    }
		}
		
	}
}