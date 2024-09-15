package excerisejava;

import java.util.*;

public class Cd34 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 4;
        System.out.println(factorial(x));
    }
}
