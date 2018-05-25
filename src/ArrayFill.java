public class ArrayFill {

    static int[] buf;

    static {
        buf = new int[10];
    };

    public static int[] f(int n) {
        int mod = n % 10;
        for (int i =0; i <= mod; i++) {
            buf[i] = i;
        }
        for(int i = mod +1; i < 10; i++) {
            buf[i] = 0;
        }
        return buf;
    }
    public static void main(String arg[]) {
        int[] a = f(507);
        for (int i =0; i< 10; i++) {
            System.out.print(a[i]);
        }

    }
}
