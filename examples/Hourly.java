// GetHip Example
// Hourly

public class Hourly extends Employee {
	private double wage;
	private int hoursWorked;
	
	public Hourly(String first, String last, int id, double wage, int hours){
		super(first, last, id);
		this.wage = wage;
		this.hoursWorked = hours;
	}	

	@Override
	public double pay(){
		return wage*hoursWorked;
	}

	public void setHoursWorked(int hours){
		this.hoursWorked = hours;
	}
}
