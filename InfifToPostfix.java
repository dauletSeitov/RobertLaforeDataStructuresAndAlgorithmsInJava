import java.util.Stack;

public class InfifToPostfix {

	Stack<Character> stack = new Stack<>();
	String out = "";

	public static void main(String[] args) {
		new InfifToPostfix().doTrans(args[0]);
	}

	public String doTrans(String input) {

		for (int i = 0; i < input.length(); i++) {
			String thisOut = out;
			char ch = input.charAt(i);
			System.out.println(stack);

			switch (ch) {
				case '+' :
				case '-' :
					gotOper(ch, 1);
					break;
				case  '*':
				case  '/':
					gotOper(ch, 2);
					break;
				case  '(':
					stack.push(ch);
					break;
				case  ')':
					gotParen(ch);
					break;
				default:
				    out += ch;
  					break;
			}
		}

		while( !stack.isEmpty()) {
			System.out.println(stack);
			out = out + stack.pop();
		}

		System.out.println(out);
	  	return  null;
	}

	private void gotOper (char ch, int pos) {

		while (!stack.isEmpty()){

			char opTop = stack.pop();

			if (opTop == '('){
				stack.push(opTop);
				break;
			} else {

				int par;

				if(opTop == '+' || opTop == '-') {
					par = 1;
				} else {
					par = 2;
				}

				if(par < pos) {
					stack.push(opTop);
					break;
				} else {
					out += opTop;
				}
			}
		}
		stack.push(ch);
	}

	private void gotParen(char ch) {

		while (!stack.isEmpty()) {

		char chx = stack.pop();

		if( chx == '(')
		    break;
		else
		    out += chx;
		}
	}

}