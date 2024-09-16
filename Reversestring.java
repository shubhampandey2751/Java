package Examquestion;
import java.util.*;
public class Reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer("SHUBHAM PANDEY");
        System.out.println(s.reverse());

        StringBuilder s1=new StringBuilder("JAVA CODING");
        System.out.println(s1.reverse());

        String str=sc.nextLine();
        int l=str.length();
        String s4="";
        for(int i=l-1;i>=0;i--){
            s4=s4+str.charAt(i);
        }
        System.out.println(s4);
    }
    
}
