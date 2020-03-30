import java .util.*;
public class evenodd
{
    void even_odd(int n)
    {
        if(n%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        evenodd obj=new evenodd();
        obj.even_odd(n);
    }
}