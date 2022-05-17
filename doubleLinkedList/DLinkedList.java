package doubleLinkedList;

public class DLinkedList {
	Node head = null;
	
	public void initialize(int data){
		head = new Node();
		
		head.next = null;
		head.prev = null;
		head.data = data;
	}
	
	public void addBegin(int data){
		Node newNode = new Node();
		
		newNode.prev = null;
		newNode.data = data;
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void addLast(int data){
		Node newNode = new Node();
		Node current = new Node();
		
		newNode.data = data;
		newNode.next = null;
		current = head;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		newNode.prev = current;
	}

	public void printList(){
		Node temp = new Node();
		temp = head;
		
		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}
	
	
	
	
	
	
}
