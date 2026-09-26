public class Employee {
    String empId;
    double salary;
    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }
    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }
    void printSalary() {
        System.out.println(empId + " | Final Salary: Rs " + salary);
    }
}