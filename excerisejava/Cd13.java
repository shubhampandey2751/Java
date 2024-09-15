package excerisejava;

import java.util.*;

public class Cd13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = new String("Shubham");
        String name = "Shubham";
        System.out.print("This name is ");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);
        String str = sc.next();
        System.out.println(str);
        String str1 = sc.nextLine();
        System.out.println(str1);
    }

}
