/**
 * Created by shubham on 2/27/2017.
 */

import java.util.Arrays;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String");
        String s1 = sc.nextLine();
        String[] s2;
        s2 = s1.split(" ");
        System.out.println("Elements in String Array" + Arrays.toString(s2));
        int[] number = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            number[i] = Integer.parseInt(s2[i]);
        }
        System.out.println(" Elements in Integer Array :" + Arrays.toString(number));
        int N = number[0];
        int p = number[1];
        int q = number[2];
        int a = 0;
        int j;
        System.out.println(" " + N + " " + p + " " + q);
        for (j = 1; j <= N; j++) {
            if(j<=9) {
                if ((j % p == 0) || (j % q == 0)) {
                    System.out.print("OUT, ");
                }
            } else {
                if (j > 9) {
                    if ((j % p == 0) || (j % q == 0)) {
                        if ((Integer.toString(j).contains(Integer.toString(p)) || Integer.toString(j).contains(Integer.toString(q)))) {
                            System.out.print("OUTTHINK, ");
                        } else
                            System.out.print("OUT, ");
                    } else if ((Integer.toString(j).contains(Integer.toString(p)) || Integer.toString(j).contains(Integer.toString(q)))) {
                        System.out.print("THINK, ");
                    }
                }
                }

            }

    }
}