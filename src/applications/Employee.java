package applications;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private GregorianCalendar hiringDay;
	
	
	
@Override
	public String toString() {
		
		return name + "|"
				+ salary + "|"
				+ hiringDay.get(Calendar.YEAR) + "|"
				+ hiringDay.get(Calendar.MONTH + 1) + "|"
				+ hiringDay.get(Calendar.DAY_OF_MONTH);
	}

	// Construction, getter and setter parts
	public Employee(String name, double salary, GregorianCalendar hiringDay) {
		super();
		this.name = name;
		this.salary = salary;
		this.hiringDay = hiringDay;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public GregorianCalendar getHiringDay() {
		return hiringDay;
	}
	public void setHiringDay(GregorianCalendar hiringDay) {
		this.hiringDay = hiringDay;
	}
	
}
