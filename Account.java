class Account
{
    private int acc_no;
    private String name,address;
    public  int getacc_no()
    {
        return acc_no;
    }
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public void setacc_no(int acc_no)
    {
        this.acc_no=acc_no;
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
        Account a=new Account();
        a.setacc_no(12345);
        a.setaddress("panipat");
        a.setname("hardik dhiman");
        System.out.println("name is: "+a.getname()+" accno is: "+a.getacc_no()+" address is: "+a.getaddress());
    }
}