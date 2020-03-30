import java.util.*;
class staticmethod

{
    static void add(int a ,int b)
    {
        
        System.out.println("sum is :"+(a+b));
    }
    static void minus(int a ,int b)
    {
        System.out.println("minus is :"+(a-b));
    }
    static void multiply(int a ,int b)
    {
        System.out.println("multiply is :"+(a*b));
    }
    static void div(int a ,int b)
    {
        if(b!=0)
        System.out.println("divisin is :"+(a/b));
        else
        System.out.println("enter valid number");
    }
    static  void areaOfRectangle(int l,int b)
    {
        System.out.println("area of rectangle :"+(l*b));
    }
    static    void areaOfCircle(int r)
    {
        System.out.println("area of circle :"+(3.14*r*r));
    }



public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    add(a,b);
    minus(a,b);
    multiply(a,b);
    div(a,b);
    System.out.println("enter length and breadth to find area of rectangle");
    int l=sc.nextInt();
    int w=sc.nextInt();
    areaOfRectangle(l,w);
    System.out.println("enter radius to find area of circle");
    int r=sc.nextInt();
    areaOfCircle(r);
}    
}
