import java.util.*;
import java.io.FileOutputStream;
class fileoutputstreams
{
    
public static void main(String args[])
{
    try
    {
        FileOutputStream fout=new FileOutputStream("‪‪C:\\Users\\DELL\\Desktop\\java programs\\file.txt");
        fout.write(65);
        fout.close();
    System.out.println("success");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
