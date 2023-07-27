package linearSearch;

import linkedList.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();

		l1.insert(20);
		l1.insert(15);
		l1.insert(50);
		l1.display();
		System.out.println("\nrecursion: ");
		l1.display(l1.gethead());
		l1.insertByPostion(26, 2);
		System.out.println("\ninsert by position :");
		l1.display();

	}

}
