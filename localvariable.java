class local{
    void a()
    {
        int age=35;
        System.out.println("age is "+age);
    }
    void b()
    {
        System.out.println(age);
    }
}
public class localvariable
{    public static void main(String args[])
    {
        local obj=new local();
        obj.a();
        obj.b();
    }
}