import java.util.ArrayList;

public class curveSmotting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("_,_,_,20");
		String[] a=str.split(",");
		if(a[0].equals("_"))
		{
			a[0]="0";
		}
		if(a[a.length-1].equals("_"))
		{
			a[a.length-1]="0";
		}
		int count=0;
		ArrayList<Integer> s=new ArrayList<Integer>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<a.length;i++)
		{
			
			
			 if(a[i].equals("_"))
			{
				count++;
				
			}
			else
			{
				l.add(Integer.parseInt(a[i]));
				s.add(count);
				count=0;
			}
				
		}
		
		for(int i=0;i<s.size();i++)
		{
			
			
			System.out.println(s.get(i));

		}
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		int avg=0;
		
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<l.size()-1;i++)
		{
			 avg=(l.get(i)+l.get(i+1))/2+s.get(i);
			 for(int j=0;j<2+s.get(i);j++)
			 {
				System.out.println(avg+"d");
			 }
			 l.set(i+1 ,avg); 
		}

	}


}
