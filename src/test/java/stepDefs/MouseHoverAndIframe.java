package stepDefs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseHoverAndIframe extends BaseClass{
	
	private static final Logger logger = LogManager.getLogger(MouseHoverAndIframe.class);
	
	@When("User mouse hovers the element")
	public void user_mouse_hovers_the_element() {
	    
		actions.moveToElement(mouseHover.mouseHoverElement).perform();
		logger.info("Moved mouse over the element");
		
	}
	
	@Then("User should be able to see the options avaliable")
	public void user_should_be_able_to_see_the_options_avaliable() {
	    
		wait.until(ExpectedConditions.elementToBeClickable(mouseHover.top));
		Assert.assertTrue(mouseHover.top.isDisplayed());
		logger.info("Top element verified");
		Assert.assertTrue(mouseHover.reload.isDisplayed());
		logger.info("Reload element verified");
		
	}
	
	@When("Clicks on {string}")
	public void clicks_on(String action) {
	    
		wait.until(ExpectedConditions.elementToBeClickable(mouseHover.top));
		
		if(action.equalsIgnoreCase("top")) {
			
			mouseHover.top.click();
			logger.info("Clicked on Top");
			
		} else if(action.equalsIgnoreCase("reload")) {
			
			mouseHover.reload.click();
			logger.info("Clicked on Reload");
			
		}
		
	}
	
	@Then("User should land on top of the page")
	public void user_should_land_on_top_of_the_page() {
	    
		wait.until(ExpectedConditions.visibilityOf(radioButtons.radio1));
		Assert.assertTrue(radioButtons.radio1.isDisplayed());
		logger.info("Verified top of the page");
		
	}
	
	@When("User switches to an iframe")
	public void user_switches_to_an_iframe() {
	    
		je.executeScript("arguments[0].scrollIntoView();", mouseHover.iframe);
		driver.switchTo().frame(mouseHover.iframe);
		logger.info("Switched to Iframe");
		
	}
	
	@Then("User should switch to iframe")
	public void user_should_switch_to_iframe() {
	    
		Assert.assertTrue(mouseHover.more.isDisplayed());
		logger.info("Successfully switched to Iframe");
		
	}
	
	@When("Hovers over the more")
	public void hovers_over_the_more() {
	    
		actions.moveToElement(mouseHover.more).perform();
		logger.info("Hoverd over more");
		
	}
	
	@Then("User should be able to see list of options available")
	public void user_should_be_able_to_see_list_of_options_available() {
	    
		wait.until(ExpectedConditions.visibilityOf(mouseHover.aboutUs));
		Assert.assertTrue(mouseHover.aboutUs.isDisplayed());
		logger.info("About Us displayed");
		Assert.assertTrue(mouseHover.partimeJobs.isDisplayed());
		logger.info("Part time jobs is displayed");
		Assert.assertTrue(mouseHover.contactUs.isDisplayed());
		logger.info("Contact Us displayed");
		
	}
	
	@When("Scrolls to featured courses")
	public void scrolls_to_featured_courses() {
	    
		je.executeScript("arguments[0].scrollIntoView();", mouseHover.featuredCourse);
		logger.info("Scrolled to featured courses");
		
	}
	
	@Then("User should be able to see list of featured courses available")
	public void user_should_be_able_to_see_list_of_featured_courses_available() {
	    
		Assert.assertTrue(mouseHover.courseList.size() == 12);
		logger.info("Verifed course list");
		
	}
	
	@When("Clicks on job support")
	public void clicks_on_job_support() {
	    
		mouseHover.jobSupport.click();
		logger.info("Clicked on job support");
		
	}
	
	@Then("User should land on job support page")
	public void user_should_land_on_job_support_page() {
	    
		Assert.assertTrue(mouseHover.jobSupportPage.isDisplayed());
		logger.info("Verified job page successfully");
		
	}
	
	@When("Switches back to main page")
	public void swtich_back_to_main_page() {
		
		driver.switchTo().defaultContent();
		logger.info("Switched back to main content");
		
	}
	
	@Then("User should be able to use main page contents")
	public void check_for_main_page_content() {
		
		je.executeScript("arguments[0].scrollIntoView();", radioButtons.radio1);
		logger.info("Scrolled to top of page");
		Assert.assertTrue(radioButtons.radio1.isDisplayed());
		logger.info("Verified main page content");
		
	}

}
