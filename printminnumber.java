public class Main {
	public static void main(String[] args) {
		int[] abir = {1, 2, 3, 4, 9, 8, 66};
		int min = abir[0];
		for (int i = 1; i < abir.length; i++) {
			if (abir[i] < min) {
				min = abir[i];
			}


		}
		System.out.println(min);
	}
}