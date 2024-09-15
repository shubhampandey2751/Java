package javap;

import java.util.*;

public class Pw132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = m; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
