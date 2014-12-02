package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class TestEmployeeDetails {
	
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employeeDetails =new EmployeeDetails();
	
	
	@Test
	public void TestCalApprisal(){
		employeeDetails.setName("xyz");
		employeeDetails.setAge(25);
		employeeDetails.setMonthlySalary(8000);
		double appraisal =empBusinessLogic.calculateAppraisal(employeeDetails);
		Assert.assertEquals(500, appraisal,0.0);
	}

	@Test
	public void TestSal(){
		employeeDetails.setName("xyz");
		employeeDetails.setAge(25);
		employeeDetails.setMonthlySalary(1000);
		double salary =empBusinessLogic.calculateYearlySalary(employeeDetails);
		Assert.assertNotEquals(10000, salary,0.0);
	}

}
