/**
 * 
 */
package payroll;

import java.util.Date;

/**
 * @author HALIMA
 *
 */
public class hourlyEmployee extends Employee{

	/**
	 * 
	 */
	private int hrWorks;
	
	public hourlyEmployee(String firstName,String lastName,String email, String phNo,Date hireDate,double comissionPct,int hrWorks) {
		super(firstName,lastName,email,phNo, hireDate,comissionPct);
	}

	public int getHrWorks() {
		return hrWorks;
	}

	public void setHrWorks(int hrWorks) {
		this.hrWorks = hrWorks;
	}
	
	public int getHourWorks() {
		return 1; 
	}
	public double calFinalSalary()
	{
		return 1.0;
	}

}
