package stepDefs;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utilities;

public class Hooks extends BaseClass{
	
	@Before
	public void setUp() throws IOException {
		
		prop = Utilities.readProp("/config/config.properties");
		BaseClass.initBrowser("Chrome", prop.getProperty("url").toString().replace("\"", ""));
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties");
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			TakesScreenshot ss = (TakesScreenshot) driver;
			byte[] image = ss.getScreenshotAs(OutputType.BYTES);
		    scenario.attach(image, "image/png", scenario.getName().toString());
			
		}
		
		driver.quit();
		
	}

}
