import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class linkedlist {
	public static void main(String args[])
	{
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("chinchu");
		obj.add("salman khan");
		obj.add("amir khan");
		obj.add("sharuk khan");
		System.out.println(obj);
		System.out.println();
		obj.addFirst("hardik dhiman");
		obj.add(2,"divij");
		obj.addLast("ajay devgan");
		System.out.println("")
		System.out.println("index of chinchu "+obj.indexOf("chinchu"));
		System.out.println();
		System.out.println("the list contains");
		System.out.println();
		Iterator i=obj.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
		/*
		ArrayList<String> obj1=new ArrayList<>();
		obj1.add("ranbir singh");
		obj1.add("ambani");
		obj.addAll(obj1);
		System.out.println("after adding second list "+ obj);*/
		
		/*
		LinkedList<String> pl=new LinkedList<String>();
		pl.add("java");
		pl.add("python");
		pl.add("c++");
		pl.add("c");
		pl.add("hadoop");
		pl.add("pascal");
		System.out.println(pl);
		String element=pl.removeFirst();
		System.out.println("after removing first element "+element);
		element=pl.removeLast();
		System.out.println("after removing last element "+element);
		boolean isRemoved=pl.remove("c++");
		if(isRemoved)
		{
			System.out.println(pl);
		}
		pl.clear();
		System.out.println("cleared the linkedList "+pl);
		
		*/
				
	/*	LinkedList<Double> sp=new LinkedList<Double>();
			sp.add(45.00);
			sp.add(51.00);
			sp.add(62.50);
			sp.add(42.75);
			sp.add(36.80);
			sp.add(68.40);
			Double firstElement=sp.getFirst();
			System.out.println("intial stock price: "+firstElement);
			Double lastElement=sp.getLast();
			System.opt.println("last stock price: "+lastElement);
			*/
	}

}
