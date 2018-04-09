import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        boolean isKoca = false;
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int length = a.length;
            //System.out.println("length :"+length);
            outer: for(int i =0; i < length; i++) {
                //System.out.println(a[i]);
                if(length ==1 ) {
                    //System.out.println(a[i]);
                    if (a[i] % 3 == 0) {
                        isKoca = true;
                        break;
                    }
                } else {
                    int position = i + 1;
                    while(position < length) {
                        for (int k =0; k<length; k++) {
                            if(k != i && k!= position) {
                                if (((a[i]+a[position])-a[k]) % 3 == 0) {
                                    isKoca = true;
                                    break outer;
                                }
                            }

                        }

                        position++;
                    }
                    if(isKoca) {
                        break;
                    }
                }


            }
            //System.out.println("----------");
            if(isKoca) {
                System.out.println("Koca");
            }else {
                System.out.println("Balsa");
            }
        }
    }
}