/**
 * 
 */

package payroll;
import java.util.*;

/**
 * @author HALIMA
 *
 */
public abstract class Employee {

	public static int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phNo;
	private Date hireDate;  // need to import java.util.*
	private double comissionPct;  
	
	//constructor of Employee class
	public Employee(String firstName,String lastName,String email, String phNo,Date hireDate,double comissionPct)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phNo= phNo;
		this.hireDate= hireDate;
		this.comissionPct = comissionPct;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public double getComissionPct() {
		return comissionPct;
	}
	public void setComissionPct(double comissionPct) {
		this.comissionPct = comissionPct;
	}
	
	
	public abstract double calFinalSalary();
		
		
	
}
