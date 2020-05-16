/*CS1301 Intro to Computer Science

 *Instructor: Aguirre

 *LinkedList assignment

 *Last modified: 00/20/2019 and submitted by Oswaldo Escobedo

*/

import java.util.Scanner;

public class SinglyLinkedList{
	private Node head;	
	
	public void remove(int index){
		
		if(index < 0 || this.head == null){
			return;
		}
		
		if(index == 0){
			this.head = this.head.getNext();
			return;
		}
		
		Node temp = this.head;
		int i = 0;
		
		while(temp != null && i < index - 1){		
			temp = temp.getNext();
			i++;
		}
		
		if(temp == null || temp.getNext() == null){
			return;
		}
		
		temp.setNext(temp.getNext().getNext());
		return;
	}
	
	public void add(int index, int item){
		
		if(index < 0){
			return;
		}
		
		if(index == 0){
			this.head = new Node(item, this.head);
			return;
		}
		
		Node temp = this.head;
		int i = 0;							
		
		while(temp != null && i < index - 1){
			temp = temp.getNext();
			i++;
		}
		
		if(temp == null || temp.getNext() == null){
			return;
		}
		
		Node nNode = new Node(item, temp.getNext());
		temp.setNext(nNode);
	}
	
	public void add(int item){
		
		 this.head = new Node(item, this.head);		
	}
	
	public void printList(){
		
		Node temp = this.head;
		
		while(temp != null){
			
			System.out.print(temp.getItem() + " ");		
			temp = temp.next;
		}
		
		System.out.println();
	
	}
	
	public void addLast(int item){
		
		if(this.head == null){
			this.add(item);
			return;
		}
		
		Node temp = this.head;			
		
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		
		Node nNode = new Node(item);
		temp.setNext(nNode);
	}
	
	public void clear(){
		
		this.head = null;		
	}
	
	public int getIndexOf(int item){
		
		Node temp = this.head;
		
		int index = 0;
		
		while(temp != null){
			
			if(item == temp.getItem()){			
				return index;
			}
			
			temp = temp.getNext();
			index++;
		}
		
		return -1;
	}
	
	public int get(int index){
		
		Node temp = this.head;
		
		int i;
		
		for(i = 0; i < index && temp != null; i++)
			
			temp = temp.getNext();					
		
			if (i == index && temp != null)
				return temp.getItem();
			
			else
				return -1;
		
	}
	
	public int getFirst(){
		
		return this.head.getItem();		
	}
	
	public int getLast(){
		
		Node temp = this.head;
		
		while(temp.getNext() != null){		
			temp = temp.getNext();
		}
		
		return temp.getItem();
	}

	public boolean contains(int item){
	
		Node temp = this.head;
		
		while (temp != null) {
			if (temp.getItem() == item){	
				return true;
			}
			temp = temp.getNext();
		}
		
		return false;
	}
	
	public void removeFirst(){
		
		if(this.head == null){
			return;
		}
		
		 if(this.head != null){
            this.head = this.head.getNext();
		}
	}
	
	public void removeLast(){
		
		if(this.head == null){
			return;
		}
		
		if(this.head.getNext() == null){
			this.head = null;
		}
										
		Node temp = this.head;
		
		while(temp.getNext().getNext() != null){
			temp = temp.getNext();
		}
		
		temp.setNext(null);
	}
	
	public int size(){
		
		int size = 0;					
		
		for (Node temp = this.head; temp != null; temp = temp.getNext()){	
			size++;
		}
	
		return size;
	}
	
	public boolean isEmpty(){
	
		return this.head == null;		
	}
	
	public void addFirst(int item){
		
		if(this.head == null){
			this.add(item);				
			return;
		}								

		this.head = new Node(item, this.head);
	}
	
	public static void main(String[]args){
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.head = new Node(0);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(5);
		
		list.head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		list.printList();
		
		System.out.println("Item: " + list.get(1));
		
		System.out.println(list.size());
		
		System.out.println(list.contains(2));
		
		list.addFirst(1000);
		list.printList();
		
		list.removeLast();
		list.printList();
		
		list.addLast(500);
		list.printList();
		
		list.removeFirst();
		list.printList();
		
		System.out.println(list.getIndexOf(500));
		/*list.remove(0);
		list.printList();
		
		Scanner scnr = new Scanner(System.in);
		int nums = scnr.nextInt();
		
		list.add(0, nums);
		list.printList();
		
		list.add(4);
		list.printList();
		
		list.addLast(5);
		list.printList();
		
		list.addFirst(0);
		list.printList();
		
		//list.clear();
		//list.printList();
				
		System.out.print(list.contains(3));
		
		System.out.print("\nIndex: " + list.getIndexOf(1));
		
		System.out.print("\nNode: " + list.get(3));
		
		System.out.print("\n" + list.getFirst());
		
		System.out.print("\n" + list.getLast() + "\n" );
		
		list.removeFirst();
		list.removeLast();
		
		list.printList();
		
		System.out.print("\n" + list.size());
		
		list.clear();
		
		System.out.print("\n" + list.isEmpty());
		*/
	}
}