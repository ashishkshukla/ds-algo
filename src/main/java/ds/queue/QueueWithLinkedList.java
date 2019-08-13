package ds.queue;


public class QueueWithLinkedList {
	Node front;
	Node back;

	public static void main(String[] args) {
		QueueWithLinkedList queue = new QueueWithLinkedList();
		queue.enqueue(6);
		queue.enqueue(95);
		queue.enqueue(9);
		queue.display();
		queue.enqueue(32);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.dequeue();

	}

	public class Node {
		int data;
		Node nextInLine;
	}

	public void enqueue(int x) {
		Node newqueueNode = new Node();
		newqueueNode.data = x;
		if(front==null){
			front=newqueueNode;
			back=front;
		}else{
			back.nextInLine=newqueueNode;
			back=back.nextInLine;
		}

	}

	public void dequeue() {
		if(front==null){
			System.out.println("queue empty");
		}
		else{
			front=front.nextInLine;
		}
		
	}

	public void display() {
		Node traversalNode = front;
		System.out.println("printing queue");

		while (traversalNode != null) {
			System.out.println(traversalNode.data + "\n||");
			traversalNode = traversalNode.nextInLine;
		}

	}
}
