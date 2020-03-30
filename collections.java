//wrapper class is used to convert primitive into object(autoboxing) and object into primitive(unboxing).
//collection is group of objects. for data manipulation
//object are dynamic
//collection represent a set of classes and interfaces.
//it is optional
//
//iterator interface provides the faciliy the elements in a forward direction.

//methods;
//hasNext():(boolean)
//next():(object type)
//remove();(void remove last element)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class collections {

	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();
		 //works in sequential form,contains duplicate elements.
		 //maintains insertion order,not syncronized,works on index bases
		 //class manipautaion is slow because lot of shifting used to occur.
		System.out.println("size of arraylist: "+a1.size());
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		System.out.println("size of arraylist: "+a1.size());
		/*
	System.out.println("arraylist contains A: "+ a1.contains("A"));
	System.out.println("arraylist contains pen: "+ a1.contains("pen"));
	System.out.println("arraylist contains B: "+ a1.contains("B"));
	*/
	
	
	
	
	
	
		/*
		HashSet<String> h=new HashSet<String>();
		h.add("india");
		h.add("austrlia");
		h.add("south africa");
		h.add("india");
		System.out.println(h);
		System.out.println(h.contains("india"));
		h.remove("austrlia");
		System.out.println(h);
		Iterator<String>i=h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		*/
		//linked list
		// uses doubly linked list to store elements
		// can contain duplivate elements.
		//non syncronized.
		//extends list and implements queue
		// search particular address
		/*
		LinkedList<String> l=new LinkedList<>();
		l.add("hardik");
		l.add("java");
		l.add("string");
		System.out.println(l);
		l.add(3,"hello world");
		System.out.println(l);
		l.remove("hardik");
		System.out.println(l);
		l.addFirst("welcome to java world");
		l.addLast("hardik");
		System.out.println(l);
		
		*/
		//
			
	}

}
