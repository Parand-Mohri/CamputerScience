public class Employee {
    public Employee(String nname, double nsalary)
    {
        name = nname;
        salary = nsalary;
    }
    public String getname()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    public String toString()
    {
        return ("Employee[name = " + name +", salary = " + salary + "]");
    }
    private String name;
    private double salary;
}
