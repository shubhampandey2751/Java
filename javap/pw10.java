package javap;

import java.util.*;

public class pw10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even num");
        } else {
            System.out.println("Odd number");
        }
    }
}
