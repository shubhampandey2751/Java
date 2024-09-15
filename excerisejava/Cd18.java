package excerisejava;

import java.util.*;

public class Cd18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("Mumbai");
                break;
            case 23:
                System.out.println("great");
                break;
            case 68:
                System.out.println("Ram");
            default:
                System.out.println("Enjoy");
        }
        /*
         * int age = 56;
         * if (age > 56) {
         * System.out.println("Y");
         * } else if (age > 46) {
         * System.out.println("N");
         * } else if (age > 78) {
         * System.out.println("you are experience");
         * } else {
         * System.out.println("You are not ");
         * }
         */
    }

}
