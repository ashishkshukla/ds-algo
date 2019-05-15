package ds.linkedlist;

public class MergeTwoList {
	public static Node head11;
	public static Node head21;

	public static void main(String[] args) {
		Node node11 = new Node("12", null);
		Node node12 = new Node("18", null);
		Node node13 = new Node("44", null);
		Node node14 = new Node("21", null);
		node11.next = node12;
		node12.next = node13;
		node13.next = node14;
		head11 = node11;

		Node node21 = new Node("118", null);
		Node node22 = new Node("13", null);
		Node node23 = new Node("42", null);
		Node node24 = new Node("1", null);
		Node node25 = new Node("10", null);

		node21.next = node22;
		node22.next = node23;
		node23.next = node24;
		node24.next = node25;
		head21 = node21;
		System.out.println("First list");
        PrepareList.printList(head11);
    	System.out.println("Second list");
        PrepareList.printList(head21);
		mergeList(head11, head21);
		System.out.println("First list after merge");
		PrepareList.printList(head11);
		System.out.println("Second list after merge");
		PrepareList.printList(head21);
	}

	private static void mergeList(Node list1, Node list2) {
		while (list1!= null) {
          Node temp1=list1.next;
          if(list2!=null){
        	  Node temp2=list2;
        	  list2=list2.next;
        	  list1.next=temp2;
        	  temp2.next=temp1;
        	  list1=temp1;
          }else{
        	  head21=null;
        	  return;
          }
		}
		head21=list2;
	}
}
