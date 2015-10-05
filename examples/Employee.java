// GetHip Example Class
// Employee

public abstract class Employee implements Payable
{
	public String FirstName;
	public String LastName;
	public int EmployeeID;

	public Employee(String first, String last, int id){
		FirstName = first;
		LastName = last;
		EmployeeID = id;
	}

	//public abstract double payEmployee();
}
