public class InterfaceTest implements TestInterface{

    public static void main(String arg[]) {
        System.out.println(TestInterface.i);
    }

    @Override
    public void test() {

    }

    static void test1() {
        System.out.println("test1");
    }
}
