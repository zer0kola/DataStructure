package RecursiveCall;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(num));
    }
    public int factorial(int num){
        if (num>1){
            return num * factorial(num-1);
        }else{
            return num;
        }
    }

}
