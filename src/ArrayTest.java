import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayTest {

    public static Scanner scan = new Scanner(System.in);
    public static void main (String arg[]) {
        ArrayTest arrayTest = new ArrayTest();
        /*int[] createdArray = arrayTest.createArray(3);
        arrayTest.printArray(createdArray);
       int[] sortedArray = arrayTest.sortArray(createdArray);
        arrayTest.printArray(sortedArray);

        Collections.reverse(Arrays.asList(sortedArray));*/

        int testArray[] = {7,8,3,2,1};
        arrayTest.sortArray(testArray);
        arrayTest.printArray(testArray);
        int testArray2[] = {7,8,3,2,1};
        arrayTest.sort1Array(testArray2);
        arrayTest.printArray(testArray2);

    }

    public int[] createArray(int noOfElements) {
        int[] array = new int[noOfElements];
        System.out.println("Enter elements");
        for (int i= 0; i<noOfElements; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public void printArray(int[] arrayToPrint) {
        for (int i =0; i<arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    public int[] sortArray(int[] arrayToSort) {
        System.out.println("Array sort started..........");
        int[] sortedArray = new int[arrayToSort.length];
        boolean flag = true;
        while (flag){
            flag = false;
            for(int i =1; i<arrayToSort.length; i++) {
                if(arrayToSort[i]<arrayToSort[i-1]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i-1];
                    arrayToSort[i-1] = temp;
                    flag = true;
                }
                System.out.println(Arrays.toString(arrayToSort));
            }
            System.out.println("done");
        }

        return arrayToSort;
    }

    public int[] sort1Array(int[] arrayToSort) {
        System.out.println("Array sort1 started..........");
        for(int i =0; i < arrayToSort.length -1; i++) {
             for(int j = i+1; j < arrayToSort.length; j++) {
                 if(arrayToSort[i]>arrayToSort[j]) {
                     int temp = arrayToSort[i];
                     arrayToSort[i] = arrayToSort[j];
                     arrayToSort[j] = temp;
                 }
                 System.out.println(Arrays.toString(arrayToSort));
            }
        }
        System.out.println("done1");
        return arrayToSort;
    }
}
