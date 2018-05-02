package validparantheses;

public class ValidParantheses {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}
