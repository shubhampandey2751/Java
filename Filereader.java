package Examquestion;
import java.io.*;
public class Filereader {
    public static void main(String[] args) {
        /*try{
            FileReader r=new FileReader("C:\\Users\\sp275\\Desktop\\java\\Examquestion\\pytred.java");
            try{
                int i;
                while((i=r.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                r.close();
                System.out.println("file close");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        /* */
        try{
            FileReader t=new FileReader("C:\\Users\\sp275\\Desktop\\java\\Examquestion\\pytred.java");
            try{
                int i;
                while((i=t.read())!=-1){
                    System.out.println((char)i);
                }
                
            }
            finally{
                t.close();
                System.out.println("File read");
            }
        }
        catch(IOException i){
            System.out.println(i);
 
        }
    }
    
}

