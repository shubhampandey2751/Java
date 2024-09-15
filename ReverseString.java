import java.io.*;
import java.util.Scanner;
 
class ReverseString {
    public static void main (String[] args) {
        String str= "Geeks", a="";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Geeks"); 
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); 
            a= ch+a; 
        }
        System.out.println("Reversed word: "+ a);
    }
}   