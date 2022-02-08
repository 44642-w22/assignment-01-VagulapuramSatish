package assignment01;
import java.util.*;

public class Solution02 {
	
	public static void solution02(){
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<ArrayList<Integer>> list2 = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numuber of integers");
		int n = scanner.nextInt();
		System.out.println("Enter the sum of the number");
		int k=scanner.nextInt();
		System.out.println("Enter the list of elememts");
		for(int i=0;i<n;i++)
		{  
			list1.add(scanner.nextInt());
		}
		System.out.println("Input (list1): "+list1);
		
		for(int i=0;i<n-1;i++)
		{
			ArrayList<Integer> pair=new ArrayList<>();
			int ele=(list1.get(i)+list1.get(i+1));
			if(k==ele)
			{
				pair.add(list1.get(i));
				pair.add(list1.get(i+1));
				list2.add(pair);
				
			}
		}
		System.out.println("Output (list2): "+list2);
		
	}
	public static void main(String[] args)
	{
		Solution02.solution02();
	}

}
