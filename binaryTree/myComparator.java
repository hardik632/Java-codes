package binaryTree;

import java.util.Comparator;

public class myComparator implements Comparator{
	public int compare(Object ob1,Object ob2)
	{
		Integer s1=(Integer) ob1;
		Integer s2=(Integer) ob2;
		if(s1==s2)
			return 0;
		else if(s1>s2)
			return -1;
		else
			return 1;
	}

}
