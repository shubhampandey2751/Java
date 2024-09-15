package Oopsjava;
class A{
    public int shubham(){
        return 5;
    }
    public  void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public  void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Methodoverriding {
    public static void main(String[] args) {

        A a =new A();  
        a.meth2();

        B b =new B();
        b.meth2();



    }
}
// static variable can change in be static method only and static method cannot with static variable
