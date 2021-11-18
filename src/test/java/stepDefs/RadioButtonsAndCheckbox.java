package stepDefs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RadioButtonsAndCheckbox extends BaseClass{
	
	private static final Logger logger = LogManager.getLogger(RadioButtonsAndCheckbox.class);
	
	@Given("User has opened the site")
	public void user_has_opened_the_site() {
	    
		logger.info(" ======== " + scenarioName + " ======== ");
		
	}
	
	@When("User clicks on a {string} radio button")
	public void user_clicks_on_a_radio_button(String radioButton) {
	    
		if(radioButton.equalsIgnoreCase("first")) {
			
			radioButtons.radio1.click();
			logger.info("Clicked on first radio button");
			
		} else if(radioButton.equalsIgnoreCase("second")) {
			
			radioButtons.radio2.click();
			logger.info("Clicked on second radio button");
			
		} else if(radioButton.equalsIgnoreCase("third")) {
			
			radioButtons.radio3.click();
			logger.info("Clicked on third radio button");
			
		}
		
	}
	
	@Then("{string} radio button should be selected")
	public void radio_button_should_be_selected(String radioButton) {
	    
		if(radioButton.equalsIgnoreCase("first")) {
			
			Assert.assertTrue(radioButtons.radio1.isSelected());
			
		} else if(radioButton.equalsIgnoreCase("second")) {
			
			Assert.assertTrue(radioButtons.radio2.isSelected());
			
		} else if(radioButton.equalsIgnoreCase("third")) {
			
			Assert.assertTrue(radioButtons.radio3.isSelected());
			
		}
		
	}
	
	@When("User unchecks the {string} radio button")
	public void user_unchecks_the_radio_button(String radioButton) {
	    
		if(radioButton.equalsIgnoreCase("first")) {
			
			if(radioButtons.radio1.isSelected()) {
				
				radioButtons.radio2.click();
				logger.info("First radio button unselected");
				
			} else {
				
				logger.info("First radio button is already unselected");
				
			}
			
		} else if (radioButton.equalsIgnoreCase("second")) {
			
			if(radioButtons.radio2.isSelected()) {
				
				radioButtons.radio3.click();
				logger.info("Second radio button unselected");
				
			} else {
				
				logger.info("Second radio button is already unselected");
				
			}
			
		} else if (radioButton.equalsIgnoreCase("third")) {
			
			if(radioButtons.radio3.isSelected()) {
				
				radioButtons.radio1.click();
				logger.info("Third radio button unselected");
				
			} else {
				
				logger.info("Third radio button is already unselected");
				
			}
			
		}
		
	}
	
	@Then("{string} radio button should be unselected")
	public void radio_button_should_be_unselected(String radioButton) {
	    
		if(radioButton.equalsIgnoreCase("first")) {
			
			Assert.assertFalse(radioButtons.radio1.isSelected());
			
		} else if (radioButton.equalsIgnoreCase("second")) {
			
			Assert.assertFalse(radioButtons.radio2.isSelected());
			
		} else if (radioButton.equalsIgnoreCase("third")) {
			
			Assert.assertFalse(radioButtons.radio3.isSelected());
			
		}
		
	}
	
	@When("User clicks on a {string} checkbox")
	public void user_clicks_on_a_checkbox(String checkbox) {
	    
		if(checkbox.equalsIgnoreCase("first")) {
			
			checkboxes.checkobox1.click();
			logger.info("Clicked on first checkbox");
			
		} else if(checkbox.equalsIgnoreCase("second")) {
			
			checkboxes.checkobox2.click();
			logger.info("Clicked on second checkbox");
			
		} else if(checkbox.equalsIgnoreCase("third")) {
			
			checkboxes.checkobox3.click();
			logger.info("Clicked on third checkbox");
			
		}
		
	}
	
	@Then("{string} checkbox should be checked")
	public void checkbox_should_be_checked(String checkbox) {
	    
		if(checkbox.equalsIgnoreCase("first")) {
			
			Assert.assertTrue(checkboxes.checkobox1.isSelected());
			logger.info("First Checkbox is checked");
			
		} else if(checkbox.equalsIgnoreCase("second")) {
			
			Assert.assertTrue(checkboxes.checkobox2.isSelected());
			logger.info("Second Checkbox is checked");
			
		} else if(checkbox.equalsIgnoreCase("third")) {
			
			Assert.assertTrue(checkboxes.checkobox3.isSelected());
			logger.info("Third Checkbox is checked");
			
		}
		
	}

	@When("User unchecks the {string} checkbox")
	public void user_unchecks_the_checkbox(String checkbox) {
	    
		if(checkbox.equalsIgnoreCase("first")) {
			
			checkboxes.checkobox1.click();
			logger.info("Unchecked first checkbox");
			
		} else if(checkbox.equalsIgnoreCase("second")) {
			
			checkboxes.checkobox2.click();
			logger.info("Unchecked second checkbox");
			
		} else if(checkbox.equalsIgnoreCase("third")) {
			
			checkboxes.checkobox3.click();
			logger.info("Unchecked second checkbox");
			
		}
		
	}
	
	@Then("{string} checkbox should be unselected")
	public void checkbox_should_be_unselected(String checkbox) {
	    
		if(checkbox.equalsIgnoreCase("first")) {
			
			Assert.assertFalse(checkboxes.checkobox1.isSelected());
			logger.info("First Checkbox is unchecked");
			
		} else if(checkbox.equalsIgnoreCase("second")) {
			
			Assert.assertFalse(checkboxes.checkobox2.isSelected());
			logger.info("Second Checkbox is unchecked");
			
		} else if(checkbox.equalsIgnoreCase("third")) {
			
			Assert.assertFalse(checkboxes.checkobox3.isSelected());
			logger.info("Third Checkbox is unchecked");
			
		}
		
	}

}
