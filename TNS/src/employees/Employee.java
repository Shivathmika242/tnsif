package employees;

/**
 * Represents a generic employee in the company.
 */
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    protected void setName(String name) { // protected (subclasses can access)
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    private void setEmployeeId(int employeeId) { // private (cannot change ID outside)
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { // public (anyone can update)
        this.salary = salary;
    }
}

