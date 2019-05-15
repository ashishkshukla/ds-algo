package ds.linkedlist;

public class ReverseList {
	public static Node head;

	public static void main(String[] args) {
		head = PrepareList.prepareList();
		PrepareList.printList(head);
		reverseList();
		System.out.println("\nReversed list \n");
		PrepareList.printList(head);
	}

	private static void reverseList() {
		Node prev = null, next;
		Node current = head;
		while(current.next!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		current.next=prev;
		head=current;
	}
}
