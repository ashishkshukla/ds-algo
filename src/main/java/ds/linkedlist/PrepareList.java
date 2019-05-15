package ds.linkedlist;

public class PrepareList {
	static Node head;

	public static Node prepareList() {
		Node node1 = new Node("ashish", null);
		addToList(node1);
		Node node2 = new Node("ajay", null);
		addToList(node2);
		Node node3 = new Node("hari", null);
		addToList(node3);
		Node node4 = new Node("ayush", null);
		addToList(node4);
		Node node5 = new Node("sweta ", null);
		addToList(node5);
		Node node6 = new Node("geetika", null);
		addToList(node6);
		Node node7 = new Node("jeetendra", null);
		addToList(node7);
		//Node node8 = new Node("Saurabh", null);
		//addToList(node8);
		return head;
	}

	private static void addToList(Node newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while (lastNode.next != null)
			lastNode = lastNode.next;

		lastNode.next = newNode;
	}

	public static void printList(Node printNode) {
		while (printNode != null) {
			System.out.println(printNode.value);
			printNode = printNode.next;
		}

	}
}
