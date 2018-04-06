public class BitDemo {

    public static void main(String arg[]) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(11));
       // System.out.println(Integer.toBinaryString(11).getBytes() & Integer.toBinaryString(12).getBytes().);
        System.out.println(val);
        System.out.println(bitmask);
        System.out.println(val & bitmask);
    }


    public  static int  hashCode1() {
        //return super.hashCode();
        return 1;
    }
}
