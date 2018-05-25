public class Main {

    public enum errCodes {
        OK(0),
        BAD_PARAMETER(1),
        TWO_FEW_PARAMETERs(2),
        NO_SUCH_FILE(10),
        FILE_READ_ONLY(11);

        private final int value_;
        public int get_value() {
            return this.value_;
        }
        errCodes(int e) { this.value_ = e;}
    }

    public enum errStatus {
        OK,
        ERROR
    }



    public static void main(String arg[]) {

        int val = Main.errCodes.BAD_PARAMETER.get_value() + errCodes.FILE_READ_ONLY.get_value();

        System.out.println(val);

        System.out.print(errStatus.OK);
    }
}
