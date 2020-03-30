import java.util.*;
import java.io.*;
public class practice
{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        /*System.out.print("enter a string: ");
        FileOutputStream fout=new FileOutputStream("D:\\java.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);    
               
            String s=sc.nextLine();    
            byte b[]=s.getBytes();    
            bout.write(b);   
            fout.close();
            bout.close();
        FileInputStream fin=new FileInputStream("D:\\java.txt");
        BufferedInputStream bin=new BufferedInputStream(fin); 
        int i;        
        while((i=bin.read())!=-1){    
            System.out.print((char)i);    
           }    
            fin.close();     
            bin.close();
    */
        System.out.print("enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("enter number of cols: ");
        int cols=sc.nextInt();
        int[][] a=new int[rows][cols];
        System.out.println("enter elements in array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
}
}