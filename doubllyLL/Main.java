package doubllyLL;

public class Main {
	public static void main(String[] args) {
		DoubllyLinkedL dll = new DoubllyLinkedL();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);

		dll.display();

		dll.insertByPosition(15, 2);
		dll.display();
		dll.insertByPosition(70, 5);
		dll.display();
		System.out.println("Insert By Position");
		dll.insertByPosition(45, 3);
		dll.display();

		dll.deleteByPoss(1);
		dll.display();
		dll.deleteByPoss(3);
		dll.display();
	}

}
