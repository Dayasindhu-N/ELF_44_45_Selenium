package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScripts;

public class TC_Login_004 extends BaseScripts {
	@Test
	public void loout() {
		Reporter.log("Logged out",true);
	}
}