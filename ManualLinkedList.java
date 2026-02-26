class node {
	int data;
	node next;
	node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class Main {
	public static void main(String[] args) {
		node head = new node(10);
		node second = new node(20);
		node third = new node(30);
		node fourth = new node(40);
		node fifth = new node(50);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ">>");
			temp = temp.next;
		}
		System.out.println("null");
		int count = 0;
		temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Total count is = " + count);
	}

}
