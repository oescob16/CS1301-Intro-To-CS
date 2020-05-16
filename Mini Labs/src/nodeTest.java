public class nodeTest{
	public static void main(String[] args){
		
		Node node1 = new Node(10);
		Node node2 = new Node();

		System.out.println("node1 -> item = " + node1.getItem());
		System.out.println("node2 -> item = " + node2.getItem());
		
		node1 = new Node(7);
		node2 = new Node(12);
		
		node1.setNext(node2);

		System.out.println("node1 -> item = " + node1.getItem());
		System.out.println("node1 -> next -> item = " + node1.getNext().getItem());
		
		node1 = new Node(1);
		node2 = new Node(22);
		Node node3 = new Node(333);

		node1.setNext(node2);
		node2.setNext(node3);

		Node.printList(node1);

		Node head = null;

		for (int i = 0; i < 5; i++) {
			head = new Node(3 * i, head);
		}

		Node.printList(head);

	}
}