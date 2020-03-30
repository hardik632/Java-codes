import java.util.*;
class nonstaticmethod

{
    void add(int a ,int b)
    {
        System.out.println("sum is :"+(a+b));
    }
    void minus(int a ,int b)
    {
        System.out.println("minus is :"+(a-b));
    }
    void multiply(int a ,int b)
    {
        System.out.println("multiply is :"+(a*b));
    }
    void div(int a ,int b)
    {
        if(b!=0)
        System.out.println("divisin is :"+(a/b));
        else
        System.out.println("enter valid number");
    }
    void areaOfRectangle(int l,int b)
    {
        System.out.println("area of rectangle :"+(l*b));
    }
    void areaOfCircle(int r)
    {
        System.out.println("area of circle :"+(3.14*r*r));
    }



public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    nonstaticmethod obj=new nonstaticmethod();
    obj.add(a,b);
    obj.minus(a,b);
    obj.multiply(a,b);
    obj.div(a,b);
    System.out.println("enter length and breadth to find area of rectangle");
    int l=sc.nextInt();
    int w=sc.nextInt();
    obj.areaOfRectangle(l,w);
    System.out.println("enter radius to find area of circle");
    int r=sc.nextInt();
    obj.areaOfCircle(r);
}    
}
