package queue;

public class Queue {
	
	public int maxSize;
	public long[] queueArray;
	public int front;
	public int rear;
	public int elementNumber;
	
//Constructor oluþturuluyor.	
	public Queue(int size){
		maxSize = size;
		queueArray = new long[maxSize];
		front = 0;
		rear = -1;
		elementNumber = 0;
	}
	
	public boolean isEmtpy(){
	    if(elementNumber == 0)
	    	return true;
	    else 
	    	return false;	
	}
		
	public void insert(long element){
		if (rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = element;
		elementNumber++;
	}
	
	public long remove(){
		front = 0;
		long removedElement = queueArray[front++];
        if (front == maxSize) {
			front = 0;
		}
        elementNumber--;
        return removedElement;
	}
	
	public void printQueue(){

		System.out.println("\nQueue is printing...");
		for(int i=0;i<rear;i++){
			System.out.print(queueArray[front]+" -> ");
			front++;
		}
		System.out.println("null");
	}
}
