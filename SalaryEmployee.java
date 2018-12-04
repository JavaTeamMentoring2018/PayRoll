/**
 * 
 */
package payroll;

import java.util.Date;

/**
 * @author HALIMA
 *
 */
public class SalaryEmployee extends Employee{

	/**
	 * 
	 */
	private double salary;
	
	public SalaryEmployee(String firstName,String lastName,String email, String phNo,Date hireDate,double comissionPctdouble,double salary) {
		super(firstName,lastName,email,  phNo, hireDate,comissionPctdouble);
		this.salary = salary;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public double calFinalSalary()
	{
		System.out.println("Salary Employees total Salary");
		return 1.0;
	}
}
