package queue;

public class TesterQueue {

	public static void main(String[] args) {
		Queue q = new Queue(6);
		System.out.print(q.insert(10)+" | ");
		System.out.print(q.insert(22)+" | ");
		System.out.print(q.insert(2)+" | ");
		System.out.print(q.delete()+" | ");
		System.out.print(q.delete()+" | ");
		
		CircularQueue cq = new CircularQueue(3);
		System.out.println("\ncircularQueue");
		System.out.print(cq.insert(10)+" | ");
		System.out.print(cq.insert(22)+" | ");
		System.out.println(cq.insert(3)+" | "); 
		System.out.print(cq.insert(4)+" | ");
		System.out.print(cq.delete()+" | ");
		System.out.println("PEEEK\n");
		System.out.println(cq.peek());

	}

}
