import java.io.*;  
public class FilterExample {  
    public static void main(String[] args) throws IOException {  
        File data = new File("D:\\testout.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to javaTpoint.";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");    
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }  
}  