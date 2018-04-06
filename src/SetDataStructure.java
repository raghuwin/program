public class SetDataStructure {

    int[] array = new int[0];
    public int[] add(int val) {
        int[] newArry = new int[array.length +1];
        for(int i =0; i<array.length; i++) {
            newArry[i] = array[i];
        }
        newArry[array.length] = val;
        array = newArry;
        return array;
    }
    public int[] remove(int val) {
        int[] newArry = new int[array.length -1];
        int j = 0;
        for(int i =0; i<array.length; i++) {
            if(array[i] != val) {
                newArry[j] = array[i];
                j++;
            }

        }
        array = newArry;
        return array;
    }

    public int get(int index) {
       return array[index-1];
    }

    @Override
    public String toString() {
        StringBuffer val = new StringBuffer();
        for(int i =0; i<array.length; i++) {
            if(i ==0)
            val.append(array[i]);
            else
                val.append(","+array[i]);
        }
        return val.toString();
    }

    public static void main(String arg[]) {
        SetDataStructure setData = new SetDataStructure();
        setData.add(1);
        setData.add(2);
        setData.add(3);
        System.out.println(setData);
        setData.remove(2);
       // System.out.println(setData);
        System.out.println(setData.get(2));
    }
}
