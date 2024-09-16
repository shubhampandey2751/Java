package Examquestion;
import java.util.*;
class LO{
    public void foo(){
        Scanner sc=new Scanner(System.in);
        int a=9;
        int b=8;
        int c=a+b;
        System.out.println("He is a gpp"+c);    
    } 
}
class n extends LO{
    public void foo1(){
        int a=9;
        int b=2;
        int c=b-a;
        System.out.println(c);;
    }
}
class o extends LO{
    public void foo2(){
        int a=9;
        int b=2;
        int c=b*a;
        System.out.println(c);;
    }
}
class j extends LO{
    public void foo3(){
        int a=9;
        int b=2;
        int c=b/a;
        System.out.println(c);;
    }
}

public class hierarical{
    public static void main(String[] args) {
        n r=new n();
        r.foo();
        r.foo1();
      
    }
}
