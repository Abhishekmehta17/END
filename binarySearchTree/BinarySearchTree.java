package binarySearchTree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	// preorder ---> p-l-r
	public void preOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
	}

	// inorder---> l-p-r
	public void inOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
	}

	public void preOrderRec(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		preOrderRec(root.getLeft());
		preOrderRec(root.getRight());
	}

	//l-p-r
	public void inOrderRec(Node root) {
		if (root == null)
			return;
		inOrderRec(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrderRec(root.getRight());
	}

	// l-r-p
	public void postOrderRec(Node root) {
		if (root == null)
			return;
		postOrderRec(root.getLeft());
		postOrderRec(root.getRight());
		System.out.print(root.getData() + " ");
	}

	public boolean find(int data) {
		Node temp = root;
		while (temp != null) {
			if (temp.getData() == data) {
				return true;
			}
			if (data < temp.getData()) {
				temp.getLeft();
			} else {
				temp.getRight();
			}
		}
		return false;
		
	}

	public int getMax() {
		if (root == null) {
			return -1;
		}

		Node temp = root;
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}

		return temp.getData();
	}

	public int getMin() {
		if (root == null) {
			return -1;
		}
		Node temp = root;
		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}

	// ------------------------------------------------------------//
	public boolean deleteByVal(int data) {
		if (root == null)
			return false;
		Node parent = root, del = root;
		while (del.getData() != data) {
			if (data < del.getData()) {
				parent = del;
				del = del.getLeft();
			} else {
				parent = del;
				del = del.getRight();
			}
			if (del == null)
				return false;
		}
		// end of 1st while
		while (true) {
			if (del.getLeft() == null && del.getRight() == null) {
				if (del == root) {
					root = null;
					return true;
				}
				if (parent.getLeft() == del) {
					parent.setLeft(null);

				} else {
					parent.setRight(null);
				}
				return true;
			} // end of 1st if condition
			if (del.getLeft() != null) {
				parent = del;
				Node max = del.getLeft();
				while (max.getRight() != null) {
					parent = max;
					max = max.getRight();
				} // while
				int temp = del.getData();
				del.setData(max.getData());
				max.setData(temp);
				del = max;
			} // end of 2nd if condition
			else {
				parent = del;
				Node min = del.getRight();
				while (min.getLeft() != null) {
					parent = min;
					min = min.getLeft();
				}
				int temp = del.getData();
				del.setData(min.getData());
				min.setData(temp);
				del = min;
			}
		}
	}

}
