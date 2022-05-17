package singlyLinkedList;

public class BListe {
	Node head = null;

//Sýfýrdan eleman ekleme.	
	public void initialize(int data) { 
		head = new Node();
		head.data = data;
		head.next = null;
	}

//Listenin baþýna eleman ekleme.	
	public void addElementFront(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

//Listenin arasýna eleman ekleme.	
	void araya_ekle(int data, int data2) {
		Node eleman = new Node();
		Node tut = new Node();
		eleman.data = data;

		Node temp = head;
		while (temp.next != null) {
			if (data2 == temp.data) {
				break;
			}
			temp = temp.next;
		}
		eleman.next = temp.next;
		temp.next = eleman;
	}

//Listenin sonuna eleman ekleme.	
	public void addElementLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

//Listeyi yazdýrma.	
	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println("Null");
	}
//Listeden eleman silme.	
	public boolean deleteNode(int data) {
		boolean durum = false;
		Node current = head;
		Node tmp = null;
		if (current.data == data) {
			tmp = current.next;
			head = tmp;
		} 
		else {
			while (current.next != null) {
				if (current.next.data == data) {
					tmp = current.next;
					current.next = tmp.next;
					durum = true;
					break;
				}
				current = current.next;
			}
		}
		return durum;
	}
  
}