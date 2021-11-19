package stepDefs;

import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HandlingDifferentWindows extends BaseClass {
	
	private static final Logger logger = LogManager.getLogger(HandlingDifferentWindows.class);
	public static String parentWindow;
	public static Set<String> openedWindows;
	
	@When("User clicks on open tab")
	public void user_click_on_open_tab() {
	    
		parentWindow = driver.getWindowHandle();
		logger.info("Parent Window Handle - " + parentWindow);
		windowHandles.openTab.click();
		logger.info("Opened new tab");
		
	}
	
	@Then("A new tab should be opened")
	public void a_new_tab_should_be_opened() {
		
		Assert.assertTrue(driver.getWindowHandles().size() == 2);
		logger.info("Verified new tab opened");
		
	}
	
	@When("Switches to a new tab")
	public void switches_to_a_new_tab() {
	    
		openedWindows = driver.getWindowHandles();
		logger.info("Windows handles available - " + openedWindows);
		
		for (String window : openedWindows) {
			
			if(!window.equalsIgnoreCase(parentWindow)) {
				
				driver.switchTo().window(window);
				logger.info("Switched to opened tab");
				break;
				
			}
			
		}
		
	}
	
	@Then("User should land on a new tab")
	public void user_should_land_on_a_new_tab() {
	    
		Assert.assertTrue(mouseHover.more.isDisplayed());
		logger.info("Successfully switched to new opened tab");
		
	}
	
	@When("User closes the tab and switches to main page")
	public void user_closes_the_tab_and_switches_to_main_page() {
	    
		logger.info("Window handle of the tab getting closed - " + driver.getWindowHandle());
		driver.close();
		logger.info("Tab Closed");
		driver.switchTo().window(parentWindow);
		logger.info("Switched to parent tab");
		
	}
	
	@Then("User should land on parent window")
	public void user_should_land_on_parent_window() {
	    
		Assert.assertTrue(radioButtons.radio1.isDisplayed());
		logger.info("Successfully landed on parent tab");
		
	}
	
	@When("User clicks on open new window")
	public void user_clicks_on_open_new_window() {
	    
		parentWindow = driver.getWindowHandle();
		windowHandles.openWindow.click();
		logger.info("Clicked on open window");
		
	}
	
	@Then("A new window should be opened")
	public void a_new_window_should_be_opened() {
	    
		Assert.assertTrue(openedWindows.size() == 2);
		logger.info("Successfully verified new window opened");
		
	}
	
	@When("Switches to new window")
	public void switches_to_new_window() {
	    
		openedWindows = driver.getWindowHandles();
		logger.info("Windows opened - " + openedWindows);
		
		for (String window : openedWindows) {
			
			if(!window.equalsIgnoreCase(parentWindow)) {
				
				driver.switchTo().window(window);
				logger.info("Switched to a new window");
				driver.manage().window().maximize();
				logger.info("Maximized new opened window");
				
			}
			
		}
		
	}
	
	@Then("User should land on new window")
	public void user_should_land_on_new_window() {
	    
		Assert.assertTrue(mouseHover.featuredCourse.isDisplayed());
		logger.info("Successfully landed on new window");
		
	}
	
	@When("User closes the window and switches to main page")
	public void user_closes_the_window_and_switches_to_main_page() {
	    
		logger.info("Window handle getting closed - " + driver.getWindowHandle());
		driver.close();
		driver.switchTo().window(parentWindow);
		logger.info("Switched to parent window");
		
	}

}
