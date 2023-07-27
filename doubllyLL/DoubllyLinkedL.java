package doubllyLL;

public class DoubllyLinkedL {

	private Node head;

	public DoubllyLinkedL() {
		this.head = null;
	}

	public Boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;

		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);

		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// insert by position
	// insert at 1st Position
	public boolean insertByPosition(int data, int position) {
		if (position <= 0 && (head == null && position > 1)) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null)
			return false;

		if (position == 1) {
			if (head != null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head = newNode;
			return true;
		}
		// insert between at any position
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		Node next = prev.getNext();
		prev.setNext(newNode);
		newNode.setPrev(prev);
		
		if(next !=null) {
			next.setPrev(prev);
			newNode.setNext(next);
		}
		return true;
	}

	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}
		Node del = head;
		while (del.getData() != data) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		Node prev = del.getPrev();
		Node next = del.getNext();
		prev.setNext(next);
		if (next != null) {
			next.setPrev(prev);
		}
		return true;
	}

	public boolean deleteByPoss(int poss) {
		if (poss <= 0 || head == null) {
			return false;
		}
		if (poss == 1) {
			head = head.getNext();
		if (head != null) {
			head.setPrev(null);
			
		}
		return true;
		}
		Node del = head;
		for (int i = 1; i < poss; i++) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		Node prev = del.getPrev();
		Node next = del.getNext();
		prev.setNext(next);
		if (next != null) {
			next.setPrev(prev);
		}
		return true;
	}

}
