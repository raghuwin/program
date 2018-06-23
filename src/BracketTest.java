import java.util.Stack;

public class BracketTest {

    public static void main (String arg[]) {

        String s1 = "}";
        String s2 = "{}";
        String s3 = "{[()]}";
        String s4 = "[((}]";
        String s5 = "[(()){}";
        validate(s5);
        //System.out.println(s1 +": "+validate(s1));
        //System.out.println(s2 +": "+validate(s2));
        //System.out.println(s3 +": "+validate(s3));
        //System.out.println(s4 +": "+validate(s4));
        //System.out.println(s5 +": "+validate(s5));


    }

    public static boolean validate(String str) {

        boolean isValid = true;
        Stack<Character> stack = new Stack<Character>();
        for(int i =0; i<str.length(); i++) {

            char current = str.charAt(i);
            if(current == '{' || current == '(' || current == '[') {
                stack.push(current);
            } else if (current == '}' || current == ')' || current == ']') {
                if(stack.empty()) {
                    return false;
                }
                char previous = stack.peek();
                if((current == '}' && previous == '{') || (current == ')' && previous == '(') || (current == ']' && previous == '[')) {
                    stack.pop();
                }else {
                    return false;
                }
            }

        }
        System.out.println(stack);
        if(!stack.isEmpty()) {
            isValid = false;
        }

        return isValid;
    }
}
