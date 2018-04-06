import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class BinarySearchTest {

    public static void main(String arg[]) {
        ArrayList<IntObject> testList = new ArrayList<IntObject>();
        for (int i =0; i<= 1000000000; i++) {
            testList.add(new IntObject(i));
        }
        Instant start = Instant.now();
        long lStartTime = System.nanoTime();


        boolean isfound = findBinarySearch(testList, new IntObject(1150));

        System.out.println(isfound);
        Instant end = Instant.now();
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        // TODO: This is for demonstration purpose only and should use the application's logging system.
        System.out.println("Method executed in " + Duration.between(end, start) + "."+output);

        Instant start1 = Instant.now();
        long lStartTime1 = System.nanoTime();


        boolean isfound1 = testList.contains(new IntObject(1150000000));

        System.out.println(isfound1);
        Instant end1 = Instant.now();
        long lEndTime1 = System.nanoTime();
        long output1 = lEndTime1 - lStartTime1;
        // TODO: This is for demonstration purpose only and should use the application's logging system.
        System.out.println("Method1 executed in " + Duration.between(end1, start1) + "."+output1);

    }

    public static boolean findBinarySearch(ArrayList<IntObject> listObj, IntObject findObject) {

        boolean isfound = false;
        int low = 0;
        int high = listObj.size()-1;
        int mid =0;
        while(low<=high) {
            mid = (low+high)/2;
            if(listObj.get(mid).getI() == findObject.getI()){
                isfound = true;
                break;
            }else if (listObj.get(mid).getI() > findObject.getI()){
                high = mid -1;
            }else if (listObj.get(mid).getI() < findObject.getI()){
                low = mid +1;
            }
        }


        return isfound;

    }
}
