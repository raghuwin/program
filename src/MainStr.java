public class MainStr {



    public static void main(String arg[]) {

        String website = "http://www.blinddata.com";

        System.out.println(parseString(website));

    }

    public static String parseString(String str) {

        str = str.replace("http://www.","");

        String temp = "";

        int i =0;

        while(str.charAt(i) != '.') {

            temp+= str.charAt(i);
            i++;
        }

        return  temp;
    }

}
