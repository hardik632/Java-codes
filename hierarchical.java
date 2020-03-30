class A
{
	void a()
	{
		System.out.print("this is a class");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("this is b class");
	}
}
class C extends A
{
	void c()
	{
		System.out.println("this is c class");
	}
}
public class hierarchical {

	void main()
	{
		System.out.println("this is main class");
	}
	public static void main(String[] args) {
		A o =new A();
		B obj=new B();
		C obj1=new C();
		hierarchical obj3=new hierarchical();
		obj.b();
		obj1.c();
		obj3.main();
		o.a();
		// TODO Auto-generated method stub
		}

}
