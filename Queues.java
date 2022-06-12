package dsa;

import java.util.Iterator;

public class Queues {

	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	private int qArray[];
	
	public Queues(int j) {
		maxSize = j;
		front = 0;
		rear = -1;
		nItems = 0;
		qArray = new int[maxSize];
	}

	public void insert(int s) {
		if(rear == maxSize-1) {
			System.out.println("Queue is full ! ");
		}
		else {
			qArray[++rear] = s;
			nItems = nItems+1;
			//nItems++;
		}
	}
	
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			nItems = nItems - 1;
			return qArray[front++];
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
		if(rear == maxSize-1) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public static void main(String[] args) {
	}

}
