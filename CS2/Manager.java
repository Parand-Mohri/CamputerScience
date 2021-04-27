public class Manager extends Employee {
    public Manager(String nname,  double nsalary, String ndepartment)
    {
        super(nname, nsalary);
        department = ndepartment;
    }
    public String toString()
    {
        return ("Manager[name = " + getname() +", salary = " + getsalary() + ", department = " + department+ "]");
    }
    public String getdepartment()
    {
        return department;
    }
    private String department;
}
