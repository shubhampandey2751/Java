package excerisejava;

import java.util.*;

public class Cd32 {
    static void foo() {
        System.out.println("Good morning bro");

    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro " + b);
    }

    static void foo(int a, int b, int c) {
        System.out.println("Good morning " + a + " bro " + b + c);
        System.out.println(c);

    }
    /*
     * static void change(int a) {
     * a = 98;
     * }
     */
    /*
     * static void change2(int[] arr) {
     * arr[0] = 98;
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int[] marks = { 23, 45, 67, 89, 32 };
         * int x = 45;
         * // change(x);
         * change2(marks);
         * System.out.println(marks[0]);
         */
        foo();
        foo(3000);
        foo(2000, 3000);

    }

}
