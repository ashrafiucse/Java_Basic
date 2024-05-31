package advance;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Ashraf");
        employee.setAge(26);
        employee.setEmployeeid(101);
        employee.setEmployeeposition("SQA Engineer");
        System.out.println(employee.getEmployeeposition());
        System.out.println(employee.getAge());
        employee.greeting();
        Person person = new Person();
        person.greeting();
    }
}
