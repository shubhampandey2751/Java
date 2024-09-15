package excerisejava;

import java.util.*;

public class Cd16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Yes you can drive");
        } else {
            System.out.println("You cannot drive");
        }
    }

}
