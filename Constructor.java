public class Constructor {
    // local variable 
      int x;
      float y;
      // non paramateraize constructor  
      Constructor(){
        x=0;
        y=0.0f  ;
      }
      void display(){
         System.out.println(x+" "+y);
      }
    public static void main(String[] args) {
        Constructor obj=new Constructor();
        obj.display();
    }
    
}
