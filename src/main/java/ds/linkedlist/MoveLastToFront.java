package ds.linkedlist;

public class MoveLastToFront {
	public static Node head;

	public static void main(String[] args) {
		head = PrepareList.prepareList();
		PrepareList.printList(head);
		moveToFront();
		PrepareList.printList(head);
	}

	private static void moveToFront() {
		Node prev = null;
		Node pointer = head;
		while (pointer.next != null) {
			prev = pointer;
			pointer = pointer.next;
		}
		pointer.next = head;
		prev.next = null;
		head = pointer;
	}
}
