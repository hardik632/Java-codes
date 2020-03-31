package array;

import java.util.Scanner;

class FindCommonElementFromThreeArray{
    public static void main( String[] args){
        Scanner obj = new Scanner( System.in );
        System.out.print( "Enter first array size : ");
        int n = obj.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = obj.nextInt();
        }
        System.out.print("Enter second array size : ");
        int m = obj.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i] = obj.nextInt();
        }
        System.out.print("Enter third array size : ");
        int o = obj.nextInt();
        int arr3[] = new int[o];
        for(int i=0;i<o;i++)
        {
            arr3[i] = obj.nextInt();
        }                
        obj.close();
        findCommonElement( arr1, arr2, arr3 );
    }
    public static void findCommonElement( int[] arr1, int[] arr2, int[] arr3 )
    {
        int a = arr1.length;
        int b = arr2.length;
        int c = arr3.length;
        int arr[] = new int[a+b+c];
        int k=0;
        for(int i=0;i<a;i++)
        {
            arr[k] = arr1[i];k++;
        }
        for(int i=0;i<b;i++)
        {
            arr[k] = arr2[i];k++;
        }
        for(int i=0;i<c;i++)
        {
            arr[k] = arr3[i];k++;
        }
        int max = arr[0];
        for( int i=0;i<arr.length;i++)
        {
            if( arr[i] > max )
            max = arr[i];
        }
        int freqArraySize = max+1;
        int freqArray[] = new int[freqArraySize];
        for(int i=0;i<arr.length;i++)
        {
            freqArray[ arr[i] ]++;
        }
        for(int i=0;i<freqArraySize;i++)
        {
            if( freqArray[i] == 3 )
            {
                System.out.print( "comman elements is or are"+i +" ");
            }
        }
    }
}