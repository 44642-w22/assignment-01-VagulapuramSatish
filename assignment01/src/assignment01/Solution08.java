package assignment01;
import java.util.*;

public class Solution08 {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the length of the Queue");
			int n = scanner.nextInt();
			
			System.out.println("Enter the list of Integers for the Queue");
			for(int i=1; i<=n;i++) {
				queue.add(scanner.nextInt());
			}
			
			System.out.println("List of the Queue : " + queue);
			
			Stack<Integer> S = new Stack<>();
			
			Iterator<Integer> objIterator = queue.iterator();  
			while(objIterator.hasNext())
			{
				S.add(objIterator.next());
			}
			
			List<Integer> array = new ArrayList<Integer>(n);	
			
			for(int i=0;i<n;i++) {
					if(array.size()<n) {
						array.add(S.get(n-i-1));
						if(array.size()<n) {
							array.add(S.get(i));
						}
					}
			}
			System.out.println("Output ArrayList : " + array);
		}


}
