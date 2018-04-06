public interface TestInterface {
    int i = 5;
    void test();
    static void test1() {
        System.out.println("test1");
    }
    default void test2() {
        System.out.println("test2");
    }
}
