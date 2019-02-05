import java.util.Stack;

public class Parentheses {

	public static void main (String [] args) {

		Stack<Character> stack = new Stack<>();
		
		char[] array = args[0].toCharArray();
		System.out.println(args[0]);

		for (int i = 0; i < array.length; i++){

			char ch = array[i];

			switch(ch) {

				case '{' :
				case '[' :
				case '(' : stack.push(ch); break;

				case '}' :
				case ']' :
				case ')' :
					if (!stack.isEmpty()){

						char prvious = stack.pop();
						if(ch == '}' && prvious != '{' ||
							ch == ']' && prvious != '[' ||
							ch == ')' && prvious != '(')

							System.out.println("Error " + ch + " on " + i);	
					} else {
						System.out.println("Error " + ch + " on " + i);
					}
					break;
			}
		}

		if( !stack.isEmpty() )
			System.out.println("Error: missing right delimiter");
	}
}
