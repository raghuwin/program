import java.util.HashMap;

public class MapProgram {


    public static void main(String arg[]){
        HashMap<String, String> testMap = new HashMap<String, String>();
        testMap.put("Java","Java course");
        testMap.put("C","C course");
        testMap.put("Python","Python course");

        testMap.put("Java","course");
        System.out.println(testMap.get("Java"));



    }
}
