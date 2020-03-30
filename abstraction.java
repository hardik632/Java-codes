abstract class vehicle
{
	abstract void run();
}
class audi extends vehicle
{
	void run()
	{
		System.out.println("this is audi car");
	}
}
class maruti extends vehicle
{
	void run()
	{
		System.out.println("this is maruti car");
	}
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		audi au=new audi();
		maruti m=new maruti();
		au.run();
		m.run();
	}
}
