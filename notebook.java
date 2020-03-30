class notebook
{
    notebook()
    {
        System.out.println("this is default constructor");
    }
    void method()
    {
        System.out.println("this is method");
    }
    public static void main(String args[])
    {
        notebook obj=new notebook();
        obj.method();
    }
}