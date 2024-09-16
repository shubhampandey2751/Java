package Examquestion;
import java.io.*;
public class Filehandlingwrite {
    public static void main(String[] args) {
        /*try{
            FileWriter f=new FileWriter("C:\\Users\\sp275\\Desktop\\java\\Examquestion\\pytred.java");
            try{
                f.write("java is fully object oriented programming language");
            }
            finally{
                f.close();
            }
            System.out.println("Succesfully data wrote in file");
        }
        catch(IOException i){
            System.out.println(i);
        
        }
        /* */

        try{
            FileWriter t=new FileWriter("C:\\Users\\sp275\\Desktop\\java\\Examquestion\\pytred.java");
            try{
                t.write("She is a good boy");
            }
            finally{
                t.close();
            }
            System.out.println("Wrote successfully");
            
        }
        catch(IOException i){
            System.out.println(i);
        }
      
    }
    
}
