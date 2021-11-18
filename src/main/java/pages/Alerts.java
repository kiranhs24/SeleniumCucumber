package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts {
	
	WebDriver driver;
	
	public Alerts(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	@FindBy(css = "#hide-textbox")
	public WebElement hide;

	@FindBy(css = "input[value='Show']")
	public WebElement show;
	
	@FindBy(css = "input[id*='displayed']")
	public WebElement textBox;
	
	@FindBy(css = "input.inputs[name='enter-name']")
	public WebElement alertInput;
	
	@FindBy(css = "input[value^='Ale']")
	public WebElement alertButton;
	
	@FindBy(css = "input[value$='irm']")
	public WebElement confirmButton;

}
