/*CS1301 Intro to Computer Science

 *Instructor: Aguirre

 *LinkedList assignment

 *Last modified: 00/20/2019 and submitted by Oswaldo Escobedo

*/

public class Node {

	public int item;
	public Node next;
	
	public Node() {
		this(0);
	}
	
	public Node(int item) {
		this(item, null);
	}
	
	public Node(int item, Node next) {
		this.item = item;
		this.next = next;
	}

	public int getItem() {
		return this.item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public static void printList(Node head) {
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.item + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
