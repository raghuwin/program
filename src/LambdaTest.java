import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {

    public static void main(String arg[]) {
        String testStr[] = {"Raghu Pathi","Laxman Ram"};
        List<String> listStr = Arrays.asList(testStr);
        listStr.forEach((str) -> System.out.println(str));

        /*Arrays.sort(testStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Arrays.stream(testStr).forEach(System.out::println);*/

        Comparator<String> sortByLastName = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        /*Comparator<String> sortByLastName1 = (o1, o2) -> o1.substring(o1.indexOf(" ")).compareTo(o2.substring(o2.indexOf(" ")));
        Arrays.sort(testStr,sortByLastName1);
        Arrays.stream(testStr).forEach(System.out::println);*/

        Arrays.stream(testStr).sorted((o1, o2) -> o1.substring(o1.indexOf(" ")).compareTo(o2.substring(o2.indexOf(" ")))).forEach(System.out::println);

        Integer testInt[] = {12, 23, 56, 67, 99, 91, 92, 95};
        Predicate<Integer> gt90 = (i -> i >= 90);
        Arrays.stream(testInt).filter(gt90).limit(2).forEach(System.out::println);
        List newList = Arrays.stream(testInt).filter(gt90).limit(2).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}
