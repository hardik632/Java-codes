class base
{
    void method()
    {
        System.out.println("this is base class");
    }
}
class intermediate extends base
{
    void method1()
    {
        System.out.println("this is intermediate class");
    }
}
class derived extends intermediate
{
    void method2()
    {
        System.out.println("this is derived class");
    }
    public static void main(String args[])
    {
        derived d=new derived();
        d.method();
        d.method1();
        d.method2();
    }
}