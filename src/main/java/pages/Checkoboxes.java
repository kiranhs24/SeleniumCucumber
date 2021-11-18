package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoboxes {
	
	WebDriver driver;
	
	public Checkoboxes(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	@FindBy(css = "#checkBoxOption1")
	public WebElement checkobox1;
	
	@FindBy(css = "#checkBoxOption2")
	public WebElement checkobox2;

	@FindBy(css = "#checkBoxOption3")
	public WebElement checkobox3;

}
