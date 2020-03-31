package array;

class FindDuplicateNumber {
    public static void main( String[] args)
    {
        int arr[] = {5, 8, 10, 63, 5, 2, 0, 10, 12, 12};
        findDuplicates( arr );
    }
   public static void findDuplicates( int arr[] )
   {
    int max = -99999;
    for(int i = 0; i<arr.length;i++)
    {
        if( arr[i] > max)
        {
            max = arr[i];
        }
    }
    int freArraySize = max+1;
    int freqArray[] = new int[freArraySize];
    for(int i = 0; i<arr.length;i++)
    {
        freqArray[ arr[i] ]++;
    }
    for(int i = 0; i<freArraySize;i++)
    {
        if( freqArray[i] > 1 )
        System.out.print( i+" ");
    }
   }
}