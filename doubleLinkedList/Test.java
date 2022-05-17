package doubleLinkedList;

public class Test {
	public static void main(String[] args) {
	
		DLinkedList dLinkedList = new DLinkedList();
		
		dLinkedList.initialize(5);
		dLinkedList.addBegin(13);
		dLinkedList.addLast(27);
		dLinkedList.addBegin(17);
		
		dLinkedList.printList();
		
		
		
		
	}
}
