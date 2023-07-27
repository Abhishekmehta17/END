package queue;

public class CircularQueue {
	private int size;
	private int[] arr;
	private int rear,front;

	public CircularQueue(int size) {
		this.size = size;
		this.front = rear = -1;
		arr = new int[size];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return ((front == -1 && rear == size - 1) || (rear + 1) % size == front);
	}

	public boolean insert(int data) {
		if (isFull())
			return false;
		rear = (rear + 1) % size;
		arr[rear] = data;
		return true;
	}

	public int delete() {
		if (isEmpty())
			return -1;
		front = (front + 1) % size;
		return arr[front];
	}
	
	public int peek() {
		if(isEmpty())
			return -1;
		int v = (front+1)%size;
		return arr[v];
	}

}
