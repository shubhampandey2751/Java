package Oopsjava;
class Base{// public=! because iska acceses modifier default ho
    public int x; // int x
    public int getX(){
        return x;
        // phone is the super class / base class / parent class
        // smartphone is the subclass / Derived class /child class
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x=x;
        // to the individual alternative

    }
    public void printMe(){
        System.out.println("i am a constructor");
    }

}
class Derived extends Base{
    public int y; // int y
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("he is a good boy");
        this.y=y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        //Base b = new Base();
        //b.setX(4);
        //System.out.println(b.getX());

        // creating an Object of derived class
        //Derived b1 = new Derived();
        //b1.setX(8);
       // System.out.println(b1.getX());

        Derived b1 = new Derived();
        b1.setX(5);
        b1.setY(8);
        System.out.println(b1.getY());
        b1.printMe();


    }
}

