import java.util.*;
public class RivisonExceptonHandling {
	public static void main(String[] args) {
		/*
		 try{
			int data = 50/0;
			System.out.println("code of try");
			System.out.println("code of try");
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("im catch block");
		}
		System.out.println("rest of code");
		*/
		/*
		try{    
            int a[]=new int[5]; 
           // System.out.println(a[6]);
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");    
           */
		/*
		  try{  
			   int data=25/5;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){
				  System.out.println(e);
				  }  
			  finally{
				  System.out.println("finally block is always executed");
				  }  
			  System.out.println("rest of the code..."); 
			  */
		/*try{    
            String s=null;  
            System.out.println(s.length());  
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");    
           */
		int stuage=12;
		int stuweight=40;
		if(stuage<=12&&stuweight<=40)
			throw new ArithmeticException("student is not eligible");
		else
			System.out.println("student is eligible");
           
	}
}
