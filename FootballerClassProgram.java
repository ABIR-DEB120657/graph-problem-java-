class footballer {
	String name;
	private int jercynumber;
	private double playerprice;
	final String nationality= "portugal";
	footballer(String name, int jercynumber, double playerprice) {
		this.name = name;
		this.jercynumber = jercynumber;
		this.playerprice = playerprice;
		//this.nationality = nationality;
	}
		int getjercynumber () {
			return jercynumber;
		}
		double getplayerprice() {
			return playerprice;
		}
		void setjercynumber(int jercynumber) {
			this.jercynumber = jercynumber;
		}
		void setplayerprice(double playerprice) {
			this.playerprice = playerprice;
		}
		void print() {
			System.out.println(" 1. name =  " + name);
			System.out.println(" 2. jercynumber =  " + jercynumber);
			System.out.println(" 3. playerprice = " + playerprice+"M");
			System.out.println(" 4. Nationality = " + nationality);
		}
	}


	public class Main {
		public static void main(String[] args) {
		    footballer f1= new footballer("RONALDO",7,7.900034);
		   // f1.nationality = "brazil";
		    //final String nationality= " portugal"; //amra ar natinality change korta parbo n karon (final ) use korsi
		    f1.print();

		}
	}