package ds.linkedlist;

public class Palindrome {
	public static Node head;

	public static void main(String[] args) {
		Node node1 = new Node("M", null);
		Node node2 = new Node("A", null);
		Node node3 = new Node("D", null);
		Node node4 = new Node("D", null);
		Node node5 = new Node("A", null);
		Node node6 = new Node("M", null);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		head = node1;
		PrepareList.printList(head);
		checkPalindrome();

	}

	private static void checkPalindrome() {
		Node slowPtr = head;
		Node fastPtr = head;
		while (fastPtr.next != null && fastPtr.next.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		slowPtr = reverse(slowPtr.next);
		while (slowPtr.next != null) {
			if (head.next.value == slowPtr.next.value) {
				head = head.next;
				slowPtr = slowPtr.next;
			} else {
				System.out.println("List is not palindrome");
				return;
			}
		}
		System.out.println("List is palindrome");
	}

	private static Node reverse(Node current) {
		Node next;
		Node prev = null;
		while (current.next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		current.next = prev;
		return current;
	}
}
