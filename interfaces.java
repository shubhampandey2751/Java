package Excercise;
import java.util.*;
/*interface client{
    void input();
    void output();
}
public class interfaces implements client{
    String s;long n;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        s=sc.nextLine();
        n=sc.nextInt();
    }
    public void output(){
        System.out.println("shubham"+s+n);
    }
    public static void main(String[] args) {
        client c=new interfaces();
        c.input();
        c.output();
     
    }
    
}
/* */
interface Shubham{
    void input();
    void output();
}
interface Ram{
    void shyam();
    void rajan();
}
public class interfaces implements Shubham,Ram {
    String s;double b;
    public void show(){
        System.out.println("RAM");
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        s=sc.nextLine();
        b=sc.nextDouble();
    }
    public void output(){
        System.out.println(s+b);
    }
    public void shyam(){
        System.out.println("fdcheujdeud");
    }
    public void rajan(){
        System.out.println("vivel");
    }
    public static void main(String[] args) {
        Shubham c=new interfaces();
        Ram f=new interfaces();
        c.input();
        c.output();
        //c.show();
        f.shyam();
        f.rajan();
        
    
    }
}
