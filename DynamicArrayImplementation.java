class myarraylist {
	int []arr;
	int size;
	int capacity;
	myarraylist() {
		capacity = 2;
		arr = new int[capacity];
		size = 0;
	}
	void add(int value) {
		if (size == capacity) {
			resize();
		}
			arr[size] = value;
			size++;
		}
	
	void resize() {
		capacity = 2 * capacity;
		int[] newarr = new int[capacity];

		for (int i = 0 ; i < size; i++) {
			newarr[i] = arr[i];
		}
		arr = newarr;
	}


	void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}



public class Main {
	public static void main(String[] args) {
		myarraylist list = new myarraylist();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();

	}
}