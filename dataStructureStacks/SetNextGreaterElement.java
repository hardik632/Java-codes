class SetNextGreaterElement{
    public static void main( String[] args){
        int arr[] = {39, 12, 14, 56, 74, 95, 32, 17};

        setNextGreaterElement(arr);
    }
    public static void setNextGreaterElement( int[] arr )
    {
        int arr2[] = new int[arr.length];
        int k=0;
        int flag = 0;
        for(int i=0;i<arr.length;i++)
        {
            flag = 0;
            int max = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if( arr[j] > max )
                    {
                        max = arr[j];
                        flag++;
                }
            }if( flag==0)
                {
                    arr2[k] = -1; k++;
                }
            else if( flag !=0)
                {
                    arr2[k] = max; k++;
                }
        }
        for( int i=0;i<k;i++)
        {
            System.out.print( arr2[i] +" ");
        }
    }
}