public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        String s[]=new String[A.length];
        for(int i=0;i<A.length;i++)
        {
            s[i]=String.valueOf(A[i]);
        }
        
        Arrays.sort(s, new Comparator<String>(){
           public int compare(String X,String Y)
          {
                 return (Y+X).compareTo(X+Y);
          }
        });
       
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++)
        {
            sb=sb.append(s[i]);
        }
        
        while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
        return sb.toString();
        
        
        
    }
}
