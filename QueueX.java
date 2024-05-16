package question1;


public class QueueX {
	
	private int rear;	//Index of the rear item
	private int front;	//Index if the front item
	private char queArr[];	//Array to hold the queue
	private int nItems;		//no of items in the queue
	private int maxSize;	//maximum size of the queue
	
	//constructor
	public QueueX(int s) {
		this.maxSize = s; //set the size of the queue
		rear = -1;			//rear = -1 means rear is empty at the begining
		front = 0;			//start of the queue
		queArr = new char[s];	//create an array 
		nItems = 0;				//nItems = 0 means no items at the begining
	}
	
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (rear == maxSize -1);
	}
	
	public void insert(char j) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			rear++;
			queArr[rear] = j;
			nItems++;
		}
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			char temp = queArr[front];
			front++;
			nItems--;
			return temp;
		}
	}

}
