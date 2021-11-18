package stepDefs;

import java.io.IOException;
import java.time.Duration;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import baseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.Alerts;
import pages.Checkoboxes;
import pages.Dropdown;
import pages.MouseHover;
import pages.RadioButtons;
import utilities.Utilities;

public class Hooks extends BaseClass{
	
	@Before
	public void setUp(Scenario scenario) throws IOException {
		
		prop = Utilities.readProp("/config/config.properties");
		BaseClass.initBrowser("Chrome", prop.getProperty("url").toString().replace("\"", ""));
		je = (JavascriptExecutor) driver;
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties");
		scenarioName = scenario.getName().toString();
		radioButtons = PageFactory.initElements(driver, RadioButtons.class);
		checkboxes = PageFactory.initElements(driver, Checkoboxes.class);
		alerts = PageFactory.initElements(driver, Alerts.class);
		dropdown = PageFactory.initElements(driver, Dropdown.class);
		mouseHover = PageFactory.initElements(driver, MouseHover.class);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
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
