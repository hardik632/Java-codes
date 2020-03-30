
public class largestcountinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{2,7,3,7,5,7,7,3,3,3,3,3};
		int []freq=new int[a.length+1];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			freq[a[i]]+=1;
		}
		for(int i=0;i<freq.length;i++)
			System.out.print(freq[i]+" ");
		int max=-1;
		int z=0;
			for(int i=0;i<freq.length;i++)
			{
				if(max<freq[i])
				{
					max=freq[i];
					z=i;
				}
			}
			System.out.print("max count is " + z);

	}

}
