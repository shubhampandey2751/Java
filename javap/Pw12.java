package javap;

import java.util.*;

public class Pw12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question1
        // Count the number of digitd for a given number n

        /*
         * int num = sc.nextInt();
         * int count = 0;
         * while (num > 0) {
         * num = num / 10;
         * count++;
         * }
         * System.out.println(count);
         */

        // Question2
        // Find the sum of digits in a given number n

        /*
         * System.out.println(42 % 10);
         * 
         * int n = sc.nextInt();
         * int sum = 0;
         * while (n > 0) {
         * sum = sum + n % 10;
         * n = n / 10;
         * }
         * System.out.println(sum);
         */

        // Question3 Reverse the digit of a number

        /*
         * int num = sc.nextInt();
         * int reverse = 0;
         * while (num > 0) {
         * reverse = reverse * 10 + num % 10;
         * num = num / 10;
         * }
         * System.out.println(reverse);
         */

        // Question 4 Find the sum of these following series
        /*
         * int n = sc.nextInt();
         * int ans = 0;
         * for (int i = 1; i <= n; i++) {
         * if (i % 2 == 0) {
         * ans -= i;
         * } else {
         * ans += i;
         * }
         * 
         * }
         * System.out.println(ans);
         */

        // Question5
        // Print the factorial number
        /*
         * int num = sc.nextInt();
         * int fact = 1;
         * for (int i = 1; i <= num; i++) {
         * fact = fact * i;
         * }
         * System.out.println(fact);
         */

        // Question 6
        // Given 2 numbers a and b.find a raise to power b.

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(ans);

    }
}
