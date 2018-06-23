public class RecursiveTest {

    public static void main(String arg[]) {

        System.out.println(sum(4));

    }

    public static int sum(int i) {
        if(i <= 0)
            return 0;
        return i + sum(i-1);
    }
}
