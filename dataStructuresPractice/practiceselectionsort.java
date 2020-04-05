package dataStructures;
import java.util.*;
public class practiceselectionsort {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of input :");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}/*
	
	int keysize;
	for(int i=0;i<keysize;i++)
	{
	keys[i]=sc.nextInt();
	s+=keys[i];
	}
	if(s<n)
		System.out.println(-1);
	else
		Arrays.sort(fq);
	int res=0;
	int typing=1;
	int key=0;
	int letter=n-1;
	while(letter>=0)
	{
		if(key==keysize)
		{
			key=0;
			typing++;
		}
		if(keys[key]>0)
		{
			res+=typing*fq(letter);
			keys[key]--;
			--letter;
		}
		++key;
		}
		System.out.println(res);
	}
	*/
	int x=sc.nextInt();
	int y=sc.nextInt();
	int key1[]=new int[x];
	int key2[]=new int[y];
	int l=0,r=0,total=0;
	for(int i=0;i<x;i++)
	{
		key1[i]=a[i];
	}

	int j=0;
	for(int i=x;i<n;i++)
	{
		key2[j]=a[i];
		j++;
	}

	int k=1;
	for(int i=0;i<x;i++)
	{
		l=l+(key1[i]*k);
		k++;
	}
	 
	int l1=1;
	for(int i=0;i<y;i++)
	{
		r=r+(key2[i]*l1);
		l1++;
	}
	
	total=l+r;
	System.out.println(total);
		}

	}