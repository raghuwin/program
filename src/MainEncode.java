public class MainEncode {

    public static String encode(String string) {
        String result = "";
        char current = string.charAt(0);
        int count = 0;
        for (char c : string.toCharArray()) {
            if ( c == current) {
                count++;
            } else {
                result += current;
                result += Integer.toString(count);
                current =c;
                count = 1;
            }
        }
        result += current;
        result += Integer.toString(count);
        return  result;
    }

    public static void main(String arg[]) {
        System.out.println(encode("aabcccd")+" "+encode("abcd")+" "+ encode("aaaaa"));
    }
}
