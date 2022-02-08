package assignment01;
import java.util.*;

public class Solution06 {
	
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Length of the Stack");

		int n = scanner.nextInt();
		if (n % 2 == 0) {
			System.out.println("Enter the list of the Stack");
			for (int i = 0; i < n; i++) {
				stack.add(scanner.nextInt());
			}
			System.out.println("List of Integers is: " + stack);

			List<Integer> array = new ArrayList<Integer>();

			for (int i = n; i > n / 2; i--) {
				array.add(stack.get(i - 1));
			}
			for (int i = 0; i < n / 2; i++) {
				array.add(stack.get(i));
			}
			System.out.println("List of Integers : " + array);

		} else {
			System.out.println("Enter the even number for Length of the Stack");
		}

	}


}
