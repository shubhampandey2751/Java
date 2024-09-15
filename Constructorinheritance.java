package Oopsjava;
class Base1{
    Base1() {  // constructor
        System.out.println("I am a constructor");
    }
    Base1(int x){  // constructor
        System.out.println("I am overloaded constructor wit value of x as: "+x);
    }
}
class Derived1 extends Base1 {
    Derived1() { // constructor
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y){ // constructor
        super(x);
        System.out.println("I am overloaded constructor wit value of b as: "+y);
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println(" I am a child of derived constructor");
    }
    childOfDerived(int x,int y ,int z){
        super(x,y);
        System.out.println("I am overloaded constructor of derived with value of z as: "+z);
    }
}
public class Constructorinheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d1 = new Derived1();
        //Derived1 d1 = new Derived1(4,5);
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(14,18);
        //childOfDerived cd = new childOfDerived();
        childOfDerived cd = new childOfDerived(12,13,14);
    }
}
