package pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdown {
	
	WebDriver drvier;
	
	public Dropdown(WebDriver driver) {
		
		this.drvier = driver;
		
	}
	
	@FindBy(xpath = "//select[@name='dropdown-class-example']")
	public WebElement dropdown;
	
	@FindBy(xpath = "//input[contains(@id, 'autocomplete')]")
	public WebElement autoCompleteDropDown;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']")
	public WebElement autoCompleteDropDownList;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']/child::li")
	public List<WebElement> dropDownElements;

}
