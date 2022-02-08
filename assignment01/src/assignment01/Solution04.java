package assignment01;
import java.util.*;

public class Solution04 {
	
   public static void main(String[] args) {
		
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int num = scanner.nextInt();
		System.out.println("Enter the list of the Array: ");
		for (int i = 0; i < num; i++) {
			array1.add(scanner.next());
		}
		
		System.out.println("Input (array1): "+array1);
		
		List<String> array21 = getSortedStrings(array1);
		System.out.println(array21);
	}
	
	public static List<String> getSortedStrings(List<String> array1){
		List<String> array2 = new ArrayList<>();
		for(int i=0;i<array1.size();i++) {
			array2.add(array1.get(i));
		}
		Collections.sort(array2,(a,b)->a.length()-b.length());
		System.out.print("Output:");
		return array2;
	}

}
