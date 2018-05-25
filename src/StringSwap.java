public class StringSwap {

    public static String f(String s) {
        int len = s.length();
        char[] arr= s.toCharArray();
        for(int idx = len; idx > len/2; idx--) {
            //swap
            char c = arr[len - idx];
            arr[len-idx] = arr[idx - 1];
            arr[idx -1 ] = c;
        }
        return new String(arr);
    }

    public static void main(String arg[]) {

        System.out.print(f("abc_zyx"));
        System.out.print(f("000111"));
        System.out.print(f("1234"));


    }
}
