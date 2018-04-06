import java.util.*;
import java.util.stream.Collectors;

public class ArrayListLineTest {

    public static void main(String arg[]) {
        List<String> listString = new ArrayList<String>();
        listString.add("qa1 wel rty ghj");
        listString.add("qa1 876 rty ghj");
        listString.add("qa1 all rty ghj");
        listString.add("qa1 123 rty ghj");

        Comparator<String> thisComp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String o1 = str1.split(" ")[1];
                String o2 = str2.split(" ")[1];
                if(isInt(o1) && isInt(o2)) {
                    if(Integer.parseInt(o1)<Integer.parseInt(o2)) {
                        return -1;
                    } else if (Integer.parseInt(o1)>Integer.parseInt(o2)) {
                        return 1;
                    }else {
                        return 0;
                    }

                } else if (isInt(o1)) {
                    return 1;
                } else if(isInt(o2)){
                    return  -1;
                }
                return o1.compareTo(o2);
            }
            boolean isInt(String str) {
                boolean isInt = false;
                try {
                    Integer.parseInt(str);
                    isInt = true;
                }catch (NumberFormatException nEx) {

                }
                return isInt;
            }
        };

        //Collections.sort(listString,thisComp);
        System.out.println("-------------------");
        System.out.println(listString);
        System.out.println("-------------------");

       // List<String> orderd = listString.stream().sorted(C)

        listString = listString.parallelStream()
                .sorted(thisComp)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(listString);
    }
}
