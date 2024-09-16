package Examquestion;
import java.util.*;
class sp{
    public int a=6;
    protected int b=5;
    int c=9;
    private int d=4;
    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Accessmodifier {
    public static void main(String[] args) {
        sp t=new sp();
        //t.meth();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        //System.out.println(t.d);


    }
    
}
