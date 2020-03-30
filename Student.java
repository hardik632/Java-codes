class Student
{
    private int id;
    private String name,address;
    public  int getId()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void  setname(String name)
    {
        this.name=name;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
    public static void main(String[] args) {
        Student a=new Student();
        a.setid(12345);
        a.setaddress("panipat");
        a.setname("hardik dhiman");
        System.out.println("name is: "+a.getname()+
                           " id is: "+a.getId()+
                           " address is: "+a.getaddress());
    }
}