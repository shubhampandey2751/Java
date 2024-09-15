package excerisejava;

import java.util.*;

public class Cd33 {
    /*
     * static int sum(int a, int b) {
     * return a + b;
     * }
     * 
     * static int sum(int a, int b, int c) {
     * return a + b + c;
     * }
     */
    static int sum(int x, int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to varargs tutarial");
        System.out.println("the sum of two number is " + sum(4, 5, 6));
        System.out.println(sum(2, 3, 4));

    }
}
