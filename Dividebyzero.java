package Examquestion;
public class Dividebyzero{
   public static void main (String args[]) {
      int num1 = 15;
      int num2 = 0;
      try{
          int result = num1/num2;
          System.out.println("The result is" +result);
      } 
      catch (ArithmeticException e) {
         System.out.println ("Can't be divided by Zero ");
      }
      finally{
         System.out.println("Welcome");
      }
   }
}
