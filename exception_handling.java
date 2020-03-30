import java.util.*;
import java.io.IOException;
class exception_handling
{
    void m() throws IOException
    {
        throw new IOException("device error");
    }
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try{
            n();
        }
        catch(Exception e)
        {
            System.out.println("exception handled");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        exception_handling obj=new exception_handling();
        obj.p();
        System.out.println("normal flow........");

        try
        {
            int a[]={1,2,3,4,5};
            for(int i=0;i<7;++i)
            {
                System.out.println(a[i]);
            }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("0");
        }
        /*
       System.out.print("enter first number: ");
        int a=sc.nextInt();
        System.out.print("enter second number: ");
        int b=sc.nextInt();
        
        try {
                int c=a/b;
                System.out.println(c);

        }
         catch ( Exception e) {
            System.out.println("cant be divided by 0");
    }
    finally
    {
        System.out.println("finally block is always executed");
    }
    */
    /*
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int []a=new int[5];
        try{
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print((a[i] /0)+" ");
        }

    }
    catch (ArithmeticException e)
    {
        System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }*/     
    }
}