import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String arg[]) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("test");
        strList.add("test1");
        strList.add("test2");
        for (Iterator iterator = strList.iterator(); iterator.hasNext();) {
            System.out.println("1");
            strList.remove(1);
            System.out.println(iterator.next());
        }
        System.out.println(strList.size());
        System.out.println(strList.get(0));

        ArrayList<Integer> strList1 = new ArrayList<Integer>();
        strList1.add(12);
    }


}
