import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class treeser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SortedSet<String> s=new TreeSet<>();
		s.add("apple");
		s.add("banana");
		s.add("orange");
		s.add("apple");
		
	System.out.println(s);
	*/
		Set<Integer> number=new HashSet<>();
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(10);
		System.out.println(number);
		boolean isRemoved=number.remove(10);
		System.out.println(isRemoved);
		
		List<Integer> l=new ArrayList<>();
		l.add(4);
		l.add(9);
		number.removeIf(num -> num%2==0);
		System.out.println(number);
		number.clear();
		System.out.println(number);
		
		

	}

}
