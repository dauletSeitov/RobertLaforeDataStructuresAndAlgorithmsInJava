import java.util.Stack;

public class ExecutePostfix {

	Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) {
		new ExecutePostfix().evaluate(args[0]);
	}

	public void evaluate(String input) {

		int res = 0;
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (ch == '+' || ch == '-' || ch == '/' || ch == '*'){

				int b = stack.pop() - '0'; 
				int a = stack.pop() - '0';

				System.out.println("a: " + a);
				System.out.println("b:" + b);
				switch(ch) {

					case '+': res = a + b; break;
					case '*': res = a * b; break;
					case '/': res = a / b; break;
					case '-': res = a - b; break;

				}
				System.out.println("re:" + res);
				stack.push((char) (res + '0'));
				System.out.println("re:" + (char) (res + '0'));

			} else {
				stack.push(ch);
			}
		}

		System.out.println("res:" + stack.pop());

	}

}