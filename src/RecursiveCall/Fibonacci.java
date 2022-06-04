package RecursiveCall;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] finArr = new int[21];
        for (int i = 0; i < finArr.length; i++) {
            finArr[i] = fin(i);
        }
        System.out.println(finArr[n]);
    }

    public static int fin(int a) {
        if (a >= 2) return fin(a - 2) + fin(a - 1);
        else return a;
    }

}
