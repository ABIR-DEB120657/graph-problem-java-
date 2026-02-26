//call parents class constractor
class parents{
    int x1 = 101010;
    int x2 = 202020;
    String x3 = "my son is motherfucker";
    parents(int x1 ,int x2, String x3 ){
        this.x1= x1;
        this.x2=x2;
        this.x3=x3;
    }
}
    class child extends parents{
        child(){
            super(101010,202020,"my son is motherfucker");
        }
        void show(){
            System.out.println("Thank you");
            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
        }
    }
            
public class Main {
	public static void main(String[] args) {
		child c1 = new child();
		c1.show();
		
	}
}