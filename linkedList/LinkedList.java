package linkedList;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			this.head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " | ");
			temp = temp.getNext();
		}
		// System.out.println(temp + " ");
	}

	// with recursion
	public void display(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.getData() + " | ");
		display(head.getNext());
	}

	public Node gethead() {
		return head;

	}

	// insert at position
	public boolean insertByPostion(int data, int position) {

		if (position <= 0) {
			return false;
		}
		Node newNode = new Node(data);
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		// insert at between
		Node prev = head;
		for (int i = 0; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}

		}
		newNode.setNext(prev.getNext());

		// insert at last position
		for (int i = 0; i <= position; i++) {
			prev.setNext(newNode);
		}
		return true;

	}

}
