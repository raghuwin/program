 class Obj {
    static int id;
    static {
        id =0;
    }
    int _id;
    public static void init() {id =0;};
    Obj() {_id = id++;}
    public int get_id() {return  _id;}

}

public class MainObj {

    public static void main(String arg[]) {
        Obj.init();
        Obj o1 = new Obj();
        Obj o2 = new Obj();
        Obj o3 = new Obj();

        Obj.init();
        int id2 = o2.get_id();
        System.out.print(id2);
    }
}
