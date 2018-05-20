import java.util.*;

public class Brackets {

    public static void main(String arg[]) {

        Brackets strTest = new Brackets("{[({}())]}");
        System.out.println(strTest.validate());
    }

    private String brackets;

    public Brackets(String s) {
        brackets = s;
    }

    public boolean validate() {
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        char current, previous;
        for(int i = 0; i < this.brackets.length(); i++) {
            current = this.brackets.charAt(i);
            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if(current == ')' || current == ']' || current == '}') {
                if(stack.isEmpty()) {
                    result = false;
                } else {
                    previous = stack.peek();
                    if((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }

}

