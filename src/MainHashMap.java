import java.util.HashMap;

public class MainHashMap {

    public static void main(String arg[]) {
        HashMap<Integer, String> sysDiskDrives = new HashMap<Integer, String>();
        sysDiskDrives.put(1,"System Full");
        sysDiskDrives.put(2,"System Empty");
        sysDiskDrives.put(3,"System Restored");

        System.out.print("_");
        System.out.print(sysDiskDrives.get(1));
        System.out.print("_");
        System.out.print(sysDiskDrives.get(2));

    }
}
