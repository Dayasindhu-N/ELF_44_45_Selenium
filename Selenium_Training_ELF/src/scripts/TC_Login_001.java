package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScripts;

public class TC_Login_001 extends BaseScripts {
	@Test
	public void loginWithValidCred() {
		Reporter.log("Logged in with valid credentials",true);
	}
}