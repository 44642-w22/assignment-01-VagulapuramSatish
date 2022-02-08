package assignment01;
import java.util.*;

public class Solution03 {
	
	public static void main(String[] args) {
		
		
		List<Integer> array1= new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numuber of integers");
		int n = scanner.nextInt();
		
		System.out.println("Enter the list of elememts");
		for(int i=0;i<n;i++)
		{  
			array1.add(scanner.nextInt());
		}
		
		System.out.println("Input (array1):"+array1);
		
		int element = getMaximumNumber(array1);
		System.out.println(element);
	}
	
	public static int getMaximumNumber(List<Integer> array1){
		int maxNumber= Integer.MIN_VALUE;
		for(int i=0;i<array1.size();i++) {
			maxNumber = Math.max(maxNumber, array1.get(i));
		}
		System.out.print("Output:");
		return maxNumber;
	}

}
