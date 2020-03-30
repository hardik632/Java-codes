import java.util.*;
class returnmethod
{
static int method(int x,int y)
{
    return y+x;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers");
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println("sum is: "+method(n,m));
    
}    
}
