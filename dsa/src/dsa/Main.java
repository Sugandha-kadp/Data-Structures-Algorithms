package dsa;

class StackArray{
	private int maxSize;
	private int top;
	private double[] stackArray;
	
	public StackArray(int s) {
		top = -1;
		maxSize = s;
		stackArray = new double[maxSize];
	}
	
	public void push(int j) {
		if(top  == (maxSize - 1)) {
			System.out.println("Stack is Full ! ");
		}
		else {
			stackArray[++top] = j;
		}
	}
	
	public double pop() {
		//check whether stack is empty
		//if not, access item and decrement top
		if(top == -1) {
			System.out.println("Stack Array is Empty");
			return -1;
		}
		else {
			return stackArray[top--];
		}
	}
	
	public double peek() {
		if(top == -1) {
			System.out.println("Stack Array is Empty");
			return -1;
		}
		else{
			return stackArray[top];
		}
	}
}

class Main {
	  public static void main(String[] args) {
		  StackArray sta = new StackArray(5);
		  sta.push(9);
		  sta.push(8);
		  sta.push(5);
		  sta.push(7);
		  sta.push(3);
		  System.out.println(sta.peek());
		  System.out.println(sta.pop());
		  System.out.println(sta.peek());
		  System.out.println(sta.pop());
		  System.out.println(sta.peek());
		  System.out.println(sta.pop());
		  System.out.println(sta.peek());
		  System.out.println(sta.pop());
		  System.out.println(sta.peek());
		  System.out.println(sta.pop());
		  System.out.println(sta.pop());

	  }
	}