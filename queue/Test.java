package queue;

public class Test {
	public static void main(String[] args) {
	
		Queue queue1 = new Queue(15);
		
		queue1.insert(17);
		queue1.insert(15);
		queue1.insert(27);
		queue1.insert(35);
		queue1.insert(3);
		queue1.insert(2);
		queue1.insert(98);
		queue1.insert(25);
		
		System.out.println("Is the Queue empty? "+queue1.isEmtpy());
		queue1.printQueue();
		
		queue1.remove();
		queue1.printQueue();
		
	}
}
