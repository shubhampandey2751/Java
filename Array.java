import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int arrays[]=new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);
        /* */

        /*int size=sc.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
           System.out.println(marks[i]);
        }
        /* */

        int rows =sc.nextInt();
        int columns=sc.nextInt();
        int marks[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                marks[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

    }

    
}