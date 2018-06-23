import java.util.Stack;

public class StackTest {

    public static void main(String arg[]) {
        Stack<Character> test = new Stack<Character>();
        System.out.println(test);
        test.push('{');
        System.out.println(test);
        test.pop();
        System.out.println(test);
        test.push('[');
        System.out.println(test);



    }
}
