package AnotherStep;

import org.classes.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeTest() {
		System.out.println("before testing...................");

	}
	@After
	public void afterTst(Scenario as) {
		System.out.println("after testing................");

		TakesScreenshot ts  = (TakesScreenshot) driver;
		byte[] ac = ts.getScreenshotAs(OutputType.BYTES);
		as.embed(ac, "my screenshots");
		
	}

}
