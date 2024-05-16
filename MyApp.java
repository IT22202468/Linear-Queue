package question1;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		
		char[] charArray;
		charArray = new char[10];
		
		QueueX myQueue = new QueueX(5);
		QueueX revQueue = new QueueX(5);
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter character: ");
			Scanner sc = new Scanner(System.in);
			char input = sc.next().charAt(0);
			
			myQueue.insert(input);
		}
		
		while(!myQueue.isEmpty()) {
//			System.out.println(myQueue.remove());
			
			for(int k=0; k<5; k++) {
				charArray[k] = myQueue.remove();
			}
		}
		
		for(int k=4; k>=0; k--) {
			revQueue.insert(charArray[k]);
		}
	
		while(!revQueue.isEmpty()) {
			System.out.println(revQueue.remove());
		}
	}

}
