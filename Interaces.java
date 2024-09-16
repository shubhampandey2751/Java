package Examquestion;
import java.util.*;
interface AB{
    void input();
    void output();
}
public class Interaces implements AB{
    public void input(){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String n=sc.nextLine();
    }
    public void output(){
        System.out.println("sddd");
    }
    public static void main(String[] args) {
        Interaces c=new Interaces();
        c.input();
        c.output();

        
    }
    
}
