package ds.linkedlist;

public class PairWiseSwap {
	public static Node head;

	public static void main(String[] args) {
		head = PrepareList.prepareList();
		pairWiseSwap();
		System.out.println("List after swap Operation ");
		PrepareList.printList(head);
	}

	private static void pairWiseSwap() {
		Node pointer = head;
		while (pointer.next != null) {
			String temp = pointer.value;
			pointer.value = pointer.next.value;
			pointer.next.value = temp;
			if (pointer.next.next != null)
				pointer = pointer.next.next;
			else
				return;
		}
	}
}
