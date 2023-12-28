package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScripts;

public class TC_Login_003 extends BaseScripts {
	@Test
	public void loginWithoutCred() {
		Reporter.log("Cannot Login without credentials",true);
	}
}