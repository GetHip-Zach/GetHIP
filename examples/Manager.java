// GetHip Example
// Manager

public class Manager extends Employee{
	private double salary;

	public Manager(String first, String last, int id, double salary){
		super(first, last, id);
		this.salary = salary;	
	}

	@Override
	public double pay(){
		return salary / 24;
	}	
}
