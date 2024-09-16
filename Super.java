package Examquestion;
/*class A{
    int a=10;
    void show1(){
        System.out.println(a);
    }
}
class B extends A{
    int a=20;

    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class Superkeywor {
    public static void main(String[] args) {
        B r=new B();
        r.show();
        r.show1();
    }  
}
/* */


// Method
class z{
    void show(){
        System.out.println("Hello viewer");
    }
}
class N extends z{
    void show(){
        super.show();
        System.out.println("Hello Learner");
    }
}
public class Super{
    public static void main(String[] args) {
        N r=new N();
        r.show();
        //r.show1();
    }
    
}


// Constructor
/*class A{
    A(int a){
        System.out.println("Hello viewer"+a);
    }
}
class B extends A{
    B(){
        super(200);
        System.out.println("Hello Learner");
    }
}
public class Superkeywor {
    public static void main(String[] args) {
        B r=new B();
        
    }
    
}
/* */


