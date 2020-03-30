import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class customer {
	private static long id;
	private String name;
	public customer(long id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public boolean equals(Object o)
	{
		if(this==o)
			return true;
		if(o==null || getClass()!=o.getClass())
			return false;
		customer cust=(customer) o;
		return id== customer.id;
	}
	public int hashCode()
	{
		return Objects.hash(id);
	}
	
	public String toString()
	{
		return "customer{"+"Id="+id+",Name="+ name +"}";
	}
	
	public static void main(String[] args) {
		Set<customer> customers=new HashSet<>();
		customers.add(new customer(100,"steve"));
		customers.add(new customer(101,"jack"));
		customers.add(new customer(102,"samuel"));
		customers.add(new customer(111,"johnson"));
		System.out.println(customers);
		
	}

}
