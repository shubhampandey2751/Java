package Excercise;
interface A{
    void show();
}
interface B{
    //void show();
    void Disp();
}
public class Multipleinheritance implements A,B {
    public void show(){
        //System.out.println("Interface A & B");
        System.out.println("Interface of class A");
    }
    public void Disp(){
        System.out.println("Interface of class B ");
    }
    public static void main(String[] args) {
        Multipleinheritance r= new Multipleinheritance();
        r.show();
        r.Disp();
        
    }
    
}
