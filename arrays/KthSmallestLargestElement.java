import java.util.Scanner;

class KthSmallestLargestElement{
    public static void main( String []args){
        Scanner obj = new Scanner( System.in );
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        obj.close();
        shortArray(arr);
        int index = findKthSmallest( arr, k );
        int index2 = findKthLargest( arr, k );
        System.out.println(k+"th smallest is: "+index);
        System.out.print(k+"th largest is: "+index2);
    }
    public static int findKthSmallest( int[] arr, int k )
    {
        return arr[k-1];   
    }
    public static int findKthLargest( int[] arr, int k )
    {
        return arr[arr.length-k];
    } 
    public static void shortArray( int[] arr )
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}