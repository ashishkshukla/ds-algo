package ds.linkedlist;

public class DeleteList {
	static Node head;

	public static void main(String[] args) {
		prepareList();
		printList();
		System.out.println("Going to delete 4th Node. ");
		deleteFromN(1);
		System.out.println("updated list ");
		printList();
	}

	private static void deleteFromN(int delElementIndex) {
		Node prevNode = head;
		int indexPointer = 1;
        if(delElementIndex==1){
        	head=head.next;
        	return;
        }
		while (indexPointer < delElementIndex-1) {
			if (prevNode.next == null)
				System.out.println("Can't delete the element at index " + delElementIndex + ". ");
			else {
				prevNode = prevNode.next;
				indexPointer++;
			}
		}
		
		if(prevNode.next.next==null)
			prevNode.next=null;
		else
			prevNode.next=prevNode.next.next;
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
		while (printNode != null) {
			System.out.println(printNode.value);
			printNode = printNode.next;
		}

	}
	
	public static void prepareList() {
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
	}

}
