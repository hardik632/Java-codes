import java.util.*;
class rect
{
    void area()
    {
        int a=10;
        int b=10;
        System.out.println("area of rectangle is "+ a*b);
    }
    void cylinder()
    {
      double r=7;
        double h=10;
        System.out.println("volume of cylinder "+ 3.14*r*r*h);
    }
    public static void main(String args[])
    {
        rect r=new rect();
        r.area();
        r.cylinder();
    }
}