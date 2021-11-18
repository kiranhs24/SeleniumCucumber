package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseHover {
	
	WebDriver driver;
	
	public MouseHover(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	@FindBy(id = "mousehover") 
	public WebElement mouseHoverElement;
	
	// IFrame can only be switched with the help of id, name
	
	@FindBy(name = "iframe-name")
	public WebElement iframe;
	
	@FindBy(xpath = "//a[contains(text(), 'Top')]")
	public WebElement top;
	
	@FindBy(xpath = "//a[contains(text(), 'Top')]")
	public WebElement reload;
	
	@FindBy(css = "a[data-toggle='dropdown']")
	public WebElement more;
	
	@FindBy(css = "ul.dropdown-menu")
	public List<WebElement> moreDropDown;
	
	@FindBy(xpath = "//a[contains(text(), 'About')]")
	public WebElement aboutUs;
	
	@FindBy(xpath = "//a[contains(text(), 'jobs')]")
	public WebElement partimeJobs;
	
	@FindBy(xpath = "//a[text()='Contact']")
	public WebElement contactUs;
	
	@FindBy(xpath = "//h2[contains(text(), 'Featured')]")
	public WebElement featuredCourse;
	
	@FindBy(css = "div.courses-block")
	public List<WebElement> courseList;
	
	@FindBy(xpath = "//a[contains(text(), 'Job Support')]")
	public WebElement jobSupport;
	
	@FindBy(xpath = "//h1[contains(text(), 'Job Support')]")
	public WebElement jobSupportPage;

}
