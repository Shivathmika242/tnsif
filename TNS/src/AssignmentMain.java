

import employees.Manager;
import employees.Developer;
import com.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		 Manager manager = new Manager("Alice", 101, 80000, 10);
	        Developer developer = new Developer("Bob", 102, 60000, "Java");

	        // Use utility methods
	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);

	        // Increase salary (protected method works inside same package)
	        EmployeeUtilities.increaseSalary(manager, 5000);
	        EmployeeUtilities.increaseSalary(developer, 3000);

	        System.out.println("\nAfter salary increment:");
	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);

	}

}
