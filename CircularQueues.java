package dsa;

public class CircularQueues {

	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	private int qArray[];
	
	public CircularQueues(int j) {
		maxSize = j;
		front = 0;
		rear = -1;
		nItems = 0;
		qArray = new int[maxSize];
	}

	public void insert(int s) {
		if(nItems == maxSize) {
		System.out.println("Queue Is Full !");	
		}
		else {
			if(rear == maxSize-1) {
				rear = -1;
			}
				qArray[++rear] = s;
				nItems++;

		}
	}
	
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			int temp = qArray[front++];
			
			if(front == maxSize) {
				front = 0;
			}
			nItems--;
			
			return temp;
 
		}
		
	}
	
	public int peekFront() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			return qArray[front];
		}
	}
	
	
	// is Empty method for Queue
	public boolean isEmpty() {
		if(nItems == 0) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	// is Full method for Queue
	public boolean isFull() {
		if(nItems == maxSize) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public static void main(String[] args) {
		
		CircularQueues cQ = new CircularQueues(10);
		
		cQ.insert(10);
		cQ.insert(25);
		cQ.insert(55);
		cQ.insert(65);
		cQ.insert(85);
		
		while(!cQ.isEmpty()) {
			int val = cQ.remove();
			System.out.println(val);
		}
	}

}
