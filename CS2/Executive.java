public class Executive extends Manager {
    public Executive(String nname, double nsalary, String ndepartment)
    {
        super(nname, nsalary,ndepartment);
    }
    public String toString()
    {
        return ("Executive[name = " + getname() +", salary = " + getsalary() + ", department = " + getdepartment()+ "]");
    }
    
}
