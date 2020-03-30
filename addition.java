import java.util.*;
import java.io.*;
class addition
{
   
    void add(int a,int b)
    {
        
        int c=a+b;
        System.out.println("sum: "+c);
    }
  public static void main(String args[])
    {
        addition ad=new addition();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a=sc.nextInt();
        System.out.print("enter the second number: ");
        int b=sc.nextInt();
        ad.add(a,b);

    }
}
