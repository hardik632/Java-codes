
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.*; 
class fileinputstream 
{ 
	public static void main(String[] args) throws IOException 
	{ 
        int ch; 
        int sum=0;
        int count =0;
        Stack<Integer> k = new Stack<Integer>();
		FileReader fr=null; 
		try
		{ 
			fr = new FileReader("C:\\Users\\DELL\\Desktop\\java programs\\numbers.txt"); 
		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		} 
		while ((ch=fr.read())!=-1) {
		   sum += (char)ch;
		   count++;
		}
		System.out.println(sum/count);
        fr.close(); 
	} 
} 
   
            