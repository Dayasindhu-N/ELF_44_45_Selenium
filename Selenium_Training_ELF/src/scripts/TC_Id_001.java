package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScripts;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_001 extends BaseScripts {
	@Test
	public void login(){
		Reporter.log("Login is successfull",true);
	}
}