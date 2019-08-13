package ds.stack;

public class StackWithLinkedList {
	Node top;

	public static void main(String[] args) {
		StackWithLinkedList stack = new StackWithLinkedList();
		stack.push(6);
		stack.push(95);
		stack.push(9);
		stack.display();
		stack.push(32);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
		stack.pop();
		stack.pop();

	}

	public class Node {
		int data;
		Node nextDown;
	}

	public void push(int x) {
		Node newTopNode = new Node();
		newTopNode.data = x;
		if (top == null)
			top = newTopNode;
		else {
			newTopNode.nextDown = top;
			top = newTopNode;
		}

	}

	public void pop() {
		if (top != null)
			top = top.nextDown;
		else
			System.out.println("Stack is Empty/underflow");
	}

	public void display() {
		Node traversalNode = top;
		System.out.println("printing stack");

		while (traversalNode != null) {
			System.out.println(traversalNode.data + "\n||");
			traversalNode = traversalNode.nextDown;
		}

	}
}
