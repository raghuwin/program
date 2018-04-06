public class IntObject implements Comparable<IntObject>{
    private int i;

    public IntObject(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(IntObject o) {
        if(this.i > o.getI())
            return 1;
        else if(this.i < o.getI())
            return -1;
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.getI() == ((IntObject)obj).getI();
    }
}
