package assignment01;
import java.util.*;

public class Solution01 {
     
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of integers");
		int n = scanner.nextInt();
		System.out.println("Enter the list of elememts");
		for(int i=0;i<n;i++)
		{  
			list1.add(scanner.nextInt());
		}
		System.out.println("Input (list1): "+list1);
		
		List<Integer> list2 = getPerfectNumbers(list1);
		System.out.println(list2);
	}
	
	public static List<Integer> getPerfectNumbers(List<Integer> list1){
		List<Integer> list2 = new LinkedList<>();
		for(int i=0;i<list1.size();i++) {
			int num = list1.get(i);
			int sum=0;
			for(int j=1; j<num; j++)
			{
				if(num%j == 0)
				{
					sum += j;
				}
			}
			if(sum==num) {
				list2.add(num);
			}

		}
		System.out.print("Output (list2):");
		return list2;
	}

}
