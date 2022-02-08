package assignment01;
import java.util.*;

public class Solution05 {

	public static boolean balnced(String expression) {
		
		Deque<Character> deque = new ArrayDeque<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char x = expression.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				deque.push(x);
				continue;
			}

			if (deque.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = deque.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = deque.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = deque.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (deque.isEmpty());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string expression: ");
		String exp = scanner.next();

		if (balnced(exp))
			System.out.println("True ");
		else
			System.out.println("False");
	}
}
