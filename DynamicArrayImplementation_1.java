class myarraylist {//class banano hoisa
	int [] arr;
	int size;
	int capacity;
	myarraylist(){
	capacity = 10;
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
void resize(){
    capacity = capacity*2;
    int [] newArr = new int[capacity];
    for (int i =0 ; i<size;i++){
        newArr[i] = arr[i];
    }
        arr = newArr;
    } 
    void print(){
        for (int i =0 ; i<size;i++){
            System.out.print(arr[i]+" ");
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
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.print();


	}
}