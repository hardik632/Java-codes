import java.util.Scanner;
public class income {
    
    public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        
        double tax = 0.0;
        
        // Write your logic here
        if(age>0 && age<60)
        {
            if(income<=250000)
            {
                tax=0;
            }
            else if(income>=250001&&income<=300000)
            {
                tax=0.1*(income-250000);
            }
            else if(income>300001&&income<=500000)
            {
                tax=0.1*(300000-250000)+0.1*(income-300000);
            }
            else if(income>500001&&income<=1000000)
            {
                tax=0.1*(300000-250000)+0.1*(500000-300000)+0.2*(income-500000);
            }
            else{
               tax=0.1*(300000-250000)+0.1*(500000-300000)+0.2*(1000000-500000)+0.3*(income-1000000);
            }
        }
               else if(age>=60 && age<80)
        {
                   if(income<=250000)
                   {
                       tax=0;
                   }
                   else if(income>=250001&&income<=300000)
                   {
                       tax=0;
                   }
                   else if(income>300001&&income<=500000)
                   {
                       tax=0.1*(income-300000);
                   }
                   else if(income>500001&&income<=1000000)
                   {
                       tax=0.1*(500000-300000)+0.2*(income-500000);
                   }
                   else{
                      tax=0.1*(500000-300000)+0.2*(1000000-500000)+0.3*(income-1000000);
                   }
        }
        else
        {
            
            if(income<=250000)
            {
                tax=0;
            }
            else if(income>=250001&&income<=300000)
            {
                tax=0;
            }
            else if(income>300001&&income<=500000)
            {
                tax=0;
            }
            else if(income>500001&&income<=1000000)
            {
                tax=0.2*(income-500000);
            }
            else{
               tax=0.2*(1000000-500000)+0.3*(income-1000000);
            }
        }
        
        System.out.print(tax);
        scan.close();
    }
}