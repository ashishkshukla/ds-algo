package ds.linkedlist;

public class CheckLoop {

	private static Node head;

	public static void main(String[] args) {
		prepareLoopList();
		printList();
		checkLoop();
	}

	private static void checkLoop() {

		if (head.next == null || head.next.next == null) {
			System.out.println("list does not have any loop");
		}
		Node slowPointer = head.next;
		Node fastPointer = head.next.next;
		while (slowPointer != fastPointer) {
			if (null != fastPointer.next && null != fastPointer.next.next) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next.next;
			} else {
				System.out.println("list does not have any loop");
				return;
			}
		}
		System.out.println("Both pointer meet at " + slowPointer.value);
		slowPointer = head;
		loopStartPoint(slowPointer, fastPointer);
	}

	private static void loopStartPoint(Node slowPointer, Node fastPointer) {
		while (slowPointer != fastPointer) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
		System.out.println("Loop start point is "+slowPointer.value);
	}

	private static void prepareLoopList() {

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
		Node node7 = new Node("jeetendra", node3);
		addToList(node7);
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

	private static void printList() {
		Node printNode = head;
		int count = 0;
		while (printNode != null) {
			if (count == 21)
				break;
			System.out.println(printNode.value);
			printNode = printNode.next;
			count++;
		}

	}
}
