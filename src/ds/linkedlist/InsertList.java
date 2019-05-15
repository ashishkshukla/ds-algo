package ds.linkedlist;

public class InsertList {
	public Node head;

	public static void main(String[] args) {
		InsertList insertList = new InsertList();

		Node node1 = new Node("ashish", null);
		insertList.addToList(node1);
		Node node2 = new Node("ajay", null);
		insertList.addToList(node2);
		Node node3 = new Node("hari", null);
		insertList.addToList(node3);
		Node node4 = new Node("ayush", null);
		insertList.addToList(node4);
		Node node5 = new Node("sweta ", null);
		insertList.addToList(node5);
		Node node6 = new Node("geetika", null);
		insertList.addToList(node6);
		Node node7 = new Node("jeetendra", null);
		insertList.addToList(node7);

		insertList.printList();

		System.out.println("Going to insert from the front");

		insertList.addFront(new Node("shreyansh", null));
		System.out.println("new linked list");
		insertList.printList();
		System.out.println("Going to insert at 3rd place");
		insertList.addAtN(new Node("saurabh", null), 3);
		insertList.printList();

	}

	private void addToList(Node newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while (lastNode.next != null)
			lastNode = lastNode.next;

		lastNode.next = newNode;
	}

	public void printList() {
		Node printNode = head;
		while (printNode != null) {
			System.out.println(printNode.value);
			printNode = printNode.next;
		}

	}

	public void addFront(Node newNode) {
		newNode.next = head;
		head = newNode;
	}

	public void addAtN(Node newNode, int index) {
		Node prevNode = head;
		int indexCounter = 1;
		while ((index-1) != indexCounter) {
			if (prevNode.next == null)
				System.out.println("Cant be added to " + index + " index");
			else {
				prevNode=prevNode.next;
				indexCounter++;
			}
		}
		newNode.next=prevNode.next;
		prevNode.next=newNode;
	}
}
