class Association
{
    public static void main(String[] args) {
        Bank bank=new Bank("punjab national bank");
        Empcloyee employee=new Employee("hardik dhiman");
        System.out.println(employee.getEmployeeName() +"is employee of "+bank.getBankName());
    }
}