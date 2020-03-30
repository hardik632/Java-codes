public class typecasting
{
    public static void main(String args[])
    {
        double d=10.5;
        byte b=(byte) d;
        short s=(short) d;
        int i=(int) d;
        long l=(long) d;
        float f=(float) d;
      System.out.println(" ");
System.out.println("narrowing");
System.out.println(" ");
        System.out.println("double "+d);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println(" ");
        byte b1=10;
        short s1=b1;
        long l1=b1;
        float f1=b1;
        double d1=b1;
        System.out.println("widening");
        System.out.println(" ");
        System.out.println("double "+d1);
        System.out.println("short "+s1);
        System.out.println("byte "+b1);
        System.out.println("long "+l1);
        System.out.println("float "+f1);

      
    }
}