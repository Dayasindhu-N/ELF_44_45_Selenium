package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleDependencies {
	
	@Test(priority = 1)
	public void openAccount() {
		@SuppressWarnings("unused")
		int i=1/0;
		Reporter.log("Account Created",true);
	}
	
	@Test(priority = 5)
	public void deleteAccount() {
		Reporter.log("Account deleted",true);
	}
	
	@Test(priority = 2)
	public void updateMobileNumber() {
		Reporter.log("Mobile number updated",true);
	}
	
	@Test(priority = 4, dependsOnMethods = {"openAccount","addBeneficiary"})
	public void amountTransfer() {
		Reporter.log("Amount transferred",true);
	}
	
	@Test(priority = 3)
	public void addBeneficiary() {
		Reporter.log("Beneficiary added",true);
	}
}