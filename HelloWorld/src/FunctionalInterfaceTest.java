public interface FunctionalInterfaceTest {
    void noString();

    default void Test() {
        Test t = new Test();
    }
    public class Test{

    }
}
