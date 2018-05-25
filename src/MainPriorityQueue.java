import java.util.Comparator;
import java.util.PriorityQueue;

public class MainPriorityQueue {

    static class PQIntGt implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

    public static void main(String arg[]) {
        PQIntGt comp = new PQIntGt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(10,comp);
        priorityQueue.add(10);
        priorityQueue.add(32);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(54);
        priorityQueue.add(8);
        priorityQueue.add(100);

        while (priorityQueue.size() != 0) {
            System.out.print(priorityQueue.poll());
            System.out.print(" ");
        }

    }
}
