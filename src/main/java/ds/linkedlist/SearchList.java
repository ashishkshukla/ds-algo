package ds.linkedlist;

public class SearchList {
	public static Node head;

	public static void main(String[] args) {
		head = PrepareList.prepareList();
		PrepareList.printList(head);
		searchFromLastN(1);
	}

	private static void searchFromLastN(int searchIndex) {
		Node firstPointer = head;
		Node secondPointer = head;
		int countIndex = 1;
		while (searchIndex != countIndex) {
			if (secondPointer.next != null) {
				secondPointer = secondPointer.next;
			} else {
				System.out.println("linkedlist index out of bound ");
				return;
			}

			countIndex++;
		}
		while (secondPointer.next != null) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		System.out.println(" Node from " + searchIndex + " index from the last is : " + firstPointer.value);
	}
}
