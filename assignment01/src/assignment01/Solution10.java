package assignment01;
import java.util.*;

public class Solution10 {
	
public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();
		List<Integer> array = new ArrayList<>();	
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Deque");
		int length = scanner.nextInt();
		
		System.out.println("Enter the list of Characters for Deque");
		for(int i=1; i<=length;i++) {
			deque.add(scanner.next());
		}
		
		System.out.println("Enter the length of Array of operations");
		int len_array = scanner.nextInt();
		
		System.out.println("Enter the Array of operations in 1 and 0 ");
		for(int i=1; i<=len_array;i++) {
			array.add(scanner.nextInt());
		}
		
		System.out.println("List of Deque : " + deque);
		System.out.println("Array of operations : " + array);
		
		Deque<String> deque_duplicate = new LinkedList<>(deque);
		Stack<String> stack = new Stack<>();
		
		for(int element : array) {
			switch(element) {
			 	case 1: if(!deque_duplicate.isEmpty()) {
			 		stack.add(deque_duplicate.pollFirst());
			 		break;
			 	}
			 	case 0: if(!stack.isEmpty()) {
			 		deque_duplicate.addFirst(stack.pop());
			 		break;
			 	}
			}
		}
		
		
		Iterator<String> objIterator = deque_duplicate.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
	}	

}
