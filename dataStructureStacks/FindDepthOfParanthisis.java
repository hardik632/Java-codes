// class FindDepthOfParanthisis{
//     public static void main( String[] args){
//         String str = "(()()((())))(())()";
//         findDepthOfParanthisis( str );
//     }
//     public static void findDepthOfParanthisis( String str )
//     {
//         int countOpen = 0;
//         int countClose = 0;
//         for(int i=0;i<str.length();i++)
//         {
//             char ch = str.charAt(i);
//             char arr[] = str.toCharArray();
//             if( ch == '(')
//                 {
//                     while( arr[i] != ')')
//                     {
//                         countOpen++;
//                         i++;
//                     }
//                 }
//              else if( ch == ')' )
//              {
//                  while( arr[i] != '(')
//                  {
//                      countClose++;
//                      i++;
//                  }
//              }   
//         }
//         System.out.print(countOpen);
//     }
// }

//Java program to find the maximum depth of nested 
// parenthesis in a given expression 

class FindDepthOfParanthisis { 
    
        static int maxDepth(String S) { 
            int current_max = 0; // current count 
            int max = 0; // overall maximum count 
            int n = S.length(); 
    
            for (int i = 0; i < n; i++) { 
                if (S.charAt(i) == '(') { 
                    current_max++; 
    
                    // update max if required 
                    if (current_max > max) { 
                        max = current_max; 
                    } 
                } else if (S.charAt(i) == ')') { 
                    if (current_max > 0) { 
                        current_max--; 
                    } 
                    // else { 
                    //     return -1; 
                    // } 
                } 
            } 
    
            // finally check for unbalanced string 
            // if (current_max != 0) { 
            //     return -1; 
            // } 
    
            return max; 
        } 
    
    // Driver program 
        public static void main(String[] args) { 
            String s = "(()()((())))(())()"; 
            System.out.println(maxDepth(s)); 
        } 
    } 
    