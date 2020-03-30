import java.util.*;
class doctor
{
    void ddeatails()
    {
        System.out.println("doctor details");
    }
}
class surgeon extends doctor
{
    void sdetails()
    {
        System.out.println("surgeon details");
    }
}
public class hospital
{
    public static void main(String args[])
    {
    surgeon s=new surgeon();
    s.ddeatails();
    s.sdetails();
}}