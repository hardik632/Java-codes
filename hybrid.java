
interface hybrid_inheritance
{
	void area();
}
class cylinder implements hybrid_inheritance
{
	public void area()
		{
		int r=10;
		int h=10;
		double area=3.14*r*r*h;
		System.out.println("area of cylinder is: "+area);
	}
}
class cone implements hybrid_inheritance
{
	public void area()
	{
		int r=10;
		int h=10;
		double area=(3.14*r*r*h)/3;
		System.out.println("area of cone is: "+area);
	}
}
public class hybrid {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder h=new cylinder();
		h.area();
		cone h1=new cone();
		h1.area();

	}

}
