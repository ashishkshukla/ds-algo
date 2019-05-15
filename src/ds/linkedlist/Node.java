package ds.linkedlist;

public class Node {

	String value;
	Node next;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(String value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}
	
}
