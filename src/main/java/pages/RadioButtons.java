package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtons {
	
	WebDriver driver;
	
	public RadioButtons(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	@FindBy(css="input[value='radio1']")
	public WebElement radio1;
	
	@FindBy(css="input[value='radio2']")
	public WebElement radio2;
	
	@FindBy(css="input[value='radio3']")
	public WebElement radio3;

}
