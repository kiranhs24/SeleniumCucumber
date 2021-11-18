package stepDefs;

import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertsAndDropdowns extends BaseClass{
	
	private static final Logger logger = LogManager.getLogger(AlertsAndDropdowns.class);
	List<WebElement> dropDownOptions;
	public static Select dropDown;
	public static String dropValue = "Option1";
	
	@When("The user clicks on hide button")
	public void the_user_clicks_on_hide_button() {
		
		je.executeScript("arguments[0].scrollIntoView();", alerts.hide);
		alerts.hide.click();
		logger.info("Clicked on hide button");
		
	}
	
	@Then("The user should not be able to see the textbox")
	public void the_user_should_not_be_able_to_see_the_textbox() {
		
		Assert.assertFalse(alerts.textBox.isDisplayed());
		logger.info("Textbox is hidden");
		
	}
	
	@When("The user clicks on show button")
	public void the_user_clicks_on_show_button() {
	    
		je.executeScript("arguments[0].scrollIntoView();", alerts.hide);
		alerts.show.click();
		logger.info("Show button Clicked");
		
	}
	
	@Then("The user should be able to see textbox")
	public void the_user_should_be_able_to_see_textbox() {
	    
		wait.until(ExpectedConditions.elementToBeClickable(alerts.textBox));
		Assert.assertTrue(alerts.textBox.isDisplayed());
		logger.info("Textbox is displayed");
		
	}
	
	@When("The user enters the name and clicks on confirm")
	public void the_user_enters_the_name_and_clicks_on_confirm() {
	    
		alerts.alertInput.sendKeys("Kiran");
		logger.info("Entered text - Kiran");
		alerts.confirmButton.click();
		logger.info("Clicked on confirm button");
		
	}
	
	@Then("User should see an alert with the text message")
	public void user_should_see_an_alert_with_the_text_message() {
	    
		Alert alert = driver.switchTo().alert();
		logger.info("Switched to alert");
		Assert.assertTrue(alert.getText().contains("Kiran"));
		logger.info("Alert text verified");
		alert.accept();
		
	}
	
	@When("The user enters the name and clicks on alert")
	public void the_user_enters_the_name_and_clicks_on_alert() {
			
		alerts.alertInput.sendKeys("Kiran");
		logger.info("Entered text - Kiran");
		alerts.alertButton.click();
		logger.info("Clicked on alert button");
		
	}
	
	@Then("User should be able to dismiss the alert")
	public void dismiss_alert() {
		
		Alert alert = driver.switchTo().alert();
		logger.info("Switched to alert");
		alert.dismiss();
		logger.info("Alert Dismissed");
		
	}
	
	@When("The user clicks on drop down")
	public void click_drop_down() {
		
		dropDown = new Select(dropdown.dropdown);
		logger.info("Selected drop down");
		
	}
	
	@Then("User should be able to see list of values present in the drop down")
	public void check_drop_down_values() {
		
		dropDownOptions = dropDown.getOptions();
		logger.info("Fetched all options present in drop down");
		
		logger.info("Drop down options - " + dropDownOptions);
		Assert.assertTrue(dropDownOptions.size() > 0);
		
		Assert.assertEquals(dropDownOptions.get(1).getText(), "Option1");
		Assert.assertEquals(dropDownOptions.get(2).getText(), "Option2");
		logger.info("Drop down options verified");
		
	}
	
	@When("Selects one of the drop value by {string}")
	public void select_by_visible_text(String selectBy) {
		
		if(selectBy.contains("visible")) {
			
			dropDown.selectByVisibleText(dropValue);
			logger.info("Selected " + dropValue + " from drop down");
			
		} else if(selectBy.contains("value")) {
			
			dropDown.selectByValue(dropValue.toLowerCase());
			logger.info("Selected " + dropValue + " from drop down");
			
		}
		
	}
	
	@Then("User should be able to see the selected option in drop down")
	public void check_for_option_selected() {
		
		Assert.assertTrue(dropDown.getFirstSelectedOption().getText().toLowerCase().contains(dropValue.toLowerCase()));
		logger.info("Selected drop down value verified");
		
	}
		
	@Then("Drop down should not be multiselect")
	public void check_for_multiselect() {
		
		Assert.assertFalse(dropDown.isMultiple());
		logger.info("Drop down is not multiselect");
		
	}
	
//	@When("Deselects one of the drop value by {string}")
//	public void deselect_drop_down(String selectBy) {
//		
//		if(selectBy.contains("visible")) {
//			
//			dropDown.deselectByVisibleText(dropValue);
//			logger.info("Selected " + dropValue + " from drop down");
//			
//		} else if(selectBy.contains("value")) {
//			
//			dropDown.deselectByVisibleText(dropValue.toLowerCase());
//			logger.info("Selected " + dropValue + " from drop down");
//			
//		}
//		
//	}
//	
//	@Then("Dropdown value should be de-selected")
//	public void check_for_value_deselected() {
//		
//		Assert.assertFalse(dropDown.getFirstSelectedOption().getText().toLowerCase().contains(dropValue.toLowerCase()));
//		logger.info("Deselected drop down value verified");
//		
//	}
	
	@When("The user enters value in the text box")
	public void enter_value_drop_down() {
		
		dropdown.autoCompleteDropDown.sendKeys("in");
		logger.info("Entered value in textbox - in");
		
	}
	
	@Then("Dropdown should contain values which match with the enter keyword")
	public void check_drop_down_values_with_keyword() {
		
		wait.until(ExpectedConditions.visibilityOf(dropdown.autoCompleteDropDownList));
		logger.info("Waiting for drop down list");
		for (WebElement webElement : dropdown.dropDownElements) {
			
			Assert.assertTrue(webElement.getText().toLowerCase().contains("in")); 
			
		}
		logger.info("Verified in keyword in drop down list");
		
	}
	
	@When("Selects a value from the list")
	public void select_value_from_auto_complete_dropdown() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(dropdown.autoCompleteDropDownList));
		logger.info("Waiting for drop down list");
		for (WebElement webElement : dropdown.dropDownElements) {
			
			if(webElement.getText().equals("India")) {
				
				je.executeScript("arguments[0].scrollIntoView();", webElement);
				webElement.click();
				Thread.sleep(5000);
				logger.info("Clicked on India");
				break;
				
			} 
			
		}
		
	}
	
	@Then("Dropdown should disappear")
	public void check_for_drop_down_after_selecting_value() {
		
		Assert.assertFalse(dropdown.autoCompleteDropDownList.isDisplayed());
		logger.info("Drop down list does not exist after selecting a value");
		
	}
	
}
