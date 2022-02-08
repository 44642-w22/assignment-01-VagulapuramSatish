package assignment01;
import java.util.*;

public class Solution09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> queue_even = new LinkedList<>();
		Queue<Integer> queue_odd = new LinkedList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Queue");
		int len = scanner.nextInt();
		
		System.out.println("Enter the list of Integers for Queue");
		for(int i=1; i<=len;i++) {
		queue.add(scanner.nextInt());
		}
		
		System.out.println("List of Queue : " + queue);
		
		Queue<Integer> queue_duplicate = new LinkedList<>(queue);
		
		for(int e : queue_duplicate) {
			if(e%2==0) {
					queue_even.add(e);	
			}else{
					queue_odd.add(e);				
				}
		}
		

		System.out.println("List of Queue : " + queue_duplicate);		
		System.out.println("List of Queue with odd index elements : " + queue_odd);
		System.out.println("List of Queue with even index elements : " + queue_even);
		List<Integer> A = new ArrayList<Integer>(len);	
		
		for(int i=0;i<len;i++) {
				if(A.size()<len) {
					if(!queue_even.isEmpty()) {
						A.add(queue_even.poll());
					}
					if(A.size()<len) {
						if(!queue_odd.isEmpty()) {
							A.add(queue_odd.poll());	
						}
					}
				}
		}
		System.out.println("Output ArrayList : " + A);
		
	}

}
