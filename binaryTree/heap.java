package binaryTree;

import java.util.*;

public class heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new myComparator());
		pq.add(31);
		pq.add(4);
		pq.add(16);
		pq.add(19);
		pq.add(13);
		//for(int x: pq)
			//System.out.print(x+" ");
		//System.out.println();
		while(!pq.isEmpty())
			System.out.println(pq.poll());
		
		//for(int x: pq)
			//System.out.print(x+" ");
	}

}
