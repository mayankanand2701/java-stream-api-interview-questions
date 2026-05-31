package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group employees by department and count.
class Employee
{
	private String name;
	private String department;

	public Employee(String name, String department)
	{
		this.name = name;
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}

	@Override
	public String toString() 
	{
		return "Employee{name='" + name + "'}";
	}
}

public class Q4
{
	public static void main(String[] args) 
	{
		 List<Employee> employeeList = Arrays.asList(
		            new Employee("Arjun", "IT"),
		            new Employee("Bahnu", "HR"),
		            new Employee("Keshav", "IT"),
		            new Employee("Rajeev", "Finance")
		        );
		 
		 Map<String, List<Employee>> groupByDepartment = employeeList.stream()
				    .collect(Collectors.groupingBy(Employee::getDepartment));
		 
		 Map<String, Long> countByDept = employeeList.stream()
				    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

		 System.out.println(groupByDepartment);
		 System.out.println(countByDept);
	}
}
