package binarySearchTree;

public class Tester {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(40);
		bst.insert(60);
		bst.insert(30);
		bst.insert(45);
		bst.insert(55);
		bst.insert(65);

		System.out.println("preOrder : ");
		bst.preOrder();

		System.out.println("\nInorder : ");
		bst.inOrder();

		System.out.println("\npreOrderRec: ");
		bst.preOrderRec(bst.getRoot());

		System.out.println("\nInOrderRec: ");
		bst.inOrderRec(bst.getRoot());

		System.out.println("\n PostOrderRec");
		bst.postOrderRec(bst.getRoot());

		System.out.println("\ndeleteByVal 50 : ");
		bst.deleteByVal(50);

		System.out.println("preOrder with rec : ");
		bst.preOrderRec(bst.getRoot());

		System.out.println("\ndeleteByVal 65: ");
		bst.deleteByVal(65);

		System.out.println("preOrder with rec : ");
		bst.preOrderRec(bst.getRoot());

		System.out.println("\ngetmax: " + bst.getMax());

		System.out.println("getmin: " + bst.getMin());

	}

}
