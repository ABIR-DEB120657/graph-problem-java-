public class Main {
	public static void main(String[] args) {
		int [] abir = {1, 7, 9, 6, 3, 2, 18};
		int n = 18;//n means multiplication
		int m = 8;//m means sum
		int x = -6; //x means subtraction
		int y = 3;//y means division
		int mul = 1;
		int sum = 0;
		int sub = 0;
		double div = 1;
		for (int i = 0; i < abir.length; i++) {
			for (int j = 1; j < abir.length; j++) {
				mul = abir[i] * abir[j];
				if (mul == n) {
					System.out.println(abir[i] + "×" + abir[j] + " = " + mul);
					System.out.println("the index number is = " + i + "and" + j);
				}
			}
		}
		for (int k = 0; k < abir.length; k++) {
			for (int t = 1; t < abir.length; t++) {
				sum = abir[k] + abir[t];
				if (sum == m) {
					System.out.println(abir[k] + "+" + abir[t] + " = " + sum);
					System.out.println("the index number is = " + k + "and" + t);

				}
			}
		}
		for (int l = 0; l < abir.length; l++) {
			for (int h = 1; h < abir.length; h++) {
				sub = abir[l] - abir[h];
				if (sub == x) {
					System.out.println(abir[l] + "-" + abir[h] + " = " + sub);
					System.out.println("the index number is = " + l + "and" + h);
				}
			}
		}
		for (int c = 0; c < abir.length; c++) {
			for (int r = 1; r < abir.length; r++) {
				div = abir[c] / abir[r];
				if (div == r) {
					System.out.println(abir[c] + "÷" + abir[r] + " = " + div);
					System.out.println("the index number is = " + c + "and" + r);
				}
			}
		}
	}
}