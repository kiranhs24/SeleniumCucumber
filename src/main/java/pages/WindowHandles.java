package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowHandles {
	
	WebDriver driver;
	
	public WindowHandles(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	@FindBy(id = "opentab")
	public WebElement openTab;
	
	@FindBy(id = "openwindow")
	public WebElement openWindow;

}
