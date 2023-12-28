package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScripts;

public class TC_Login_002 extends BaseScripts {
	@Test
	public void loginWithInvalidCred() {
		Reporter.log("Logged in with Invalid credentials",true);
	}
}