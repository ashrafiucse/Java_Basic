package advance;

public class Employee extends Person{
    private int employeeid;
    private String employeeposition;

    //constructor adding
    public Employee(){
        super("Ashraf");
        System.out.println("Printing from Employee Class");
    }

    public String getEmployeeposition() {
        return employeeposition;
    }

    public void setEmployeeposition(String employeeposition) {
        this.employeeposition = employeeposition;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    @Override
    void greeting() {
        System.out.println("Printing from child class");
    }


}
