import java.util.Stack;

// Stack

public class Method4 {

	public static void main(String[] args) {
		// string to reverse
		String name = "Amritanshu";
		
		// empty character stack
		Stack<Character> charStack = new Stack<Character>();
		
		// push every character to stack
		char[] ch = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
            charStack.push(ch[i]);
        }
		
		// pop element and store
		int k =0;
		while(!charStack.isEmpty()) {
			ch[k++] = charStack.pop();
		}
		
		// convert char to string and print
		System.out.println(String.copyValueOf(ch));
		
	}

}
