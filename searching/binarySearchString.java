
	package dataStructures;
	import java.util.*;
	public class binarySearchString {

		private static Scanner sc;
		
		

		public static void main(String[] args) {
			sc = new Scanner(System.in);
			/*int n=sc.nextInt();
			sc.nextLine();
			String[] as = new String[n];
			for(int i=0;i<n;i++)
			{
				as[i]=sc.next();
			}*/
			String[] as = {"drake","walter","aaron","skyler","flynn"};
			int n=as.length;
			for(int i=0;i<n;i++)
			{
			System.out.print(as[i]+" ");
			}

			String value=sc.next();
			int end=n-1;
			int beg=0;
			int mid;
			int pos=-1;
			while(beg<=end)
			{
				mid=(beg+end)/2;
				if(as[mid].equals(value))
				{
					pos=mid;
					break;
				}
				else if(as[mid].equals(value))	{
					end=mid-1;
				}
				else
				{
					beg=mid+1;
				}
			}
			if(pos<=-1)
			{
				System.out.println("not present");
			}
			else
			{
				System.out.println("element is found at: "+pos);
			}

		}

	}


