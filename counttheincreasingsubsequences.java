
public class counttheincreasingsubsequences {

	public static void main(String args[])
	{
		int[] a=new int[] {1,3,2,5,5};
		int[] count=new int[10];
		for(int i=0;i<a.length;i++)
		{
			count[i]=1;
		}
		for(int i=1;i<a.length;i++)
		{ int max=0;
			 for(int j=0;j<i;j++)
			 {
				 if(a[i]>a[j])
				 count[i]+=count[j];
//				 if(count[j]>max)
//				 {
//					 max=count[j];
//				 }
//
//			 if(max>0)
//			 {
//				 count[j]=max;
//			 }
			 }
			count[a[i]]++;
			 
		} 

		int result=0;
		for(int i=0;i<count.length;i++)
			result+=count[i];
		System.out.print(result);
	}
}