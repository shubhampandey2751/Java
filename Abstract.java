package Examquestion;
abstract class Parent2{
    //public Parent2(){
      //  System.out.println("mai base2 ka constructor hu");
    //}
    public void sayHello(){
        System.out.println("Hello");
    } 
    abstract public void greet();

}
class child2 extends Parent2{
    public void greet(){
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good evening");
    }
}
 abstract class child3 extends Parent2{
    public void th(){
        System.out.println("i am good ");
    }
}
public class Abstract {
    public static void main(String[] args) {
        // Parent2 p =new Parent2();
        child2 c=new child2();
        //child3 c3=new child3();
        c.sayHello();
        c.greet2();
        c.greet();

    }
}