import java.util.Stack;

public class Reverse {

	public static void main (String [] args) {


		Stack<Character> stack = new Stack<>();
		
		for (char ch : "hello world".toCharArray()){
			stack.push(ch);
		}

		System.out.println(stack + "\n");

		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}

	}



}
