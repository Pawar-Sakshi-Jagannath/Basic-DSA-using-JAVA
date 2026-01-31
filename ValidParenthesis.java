
import java.util.*;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if (c == '(' && ch != ')') {
                    return false;
                }
                if (c == '{' && ch != '}') {
                    return false;
                }
                if (c == '[' && ch != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String of parenthesis :");
        String p = sc.next();
        if (isValid(p)) {
            System.out.println("Valid Pair of parenthesis ");
        } else {
            System.out.println("Invalid pair of parenthesis");
        }
    }
}
