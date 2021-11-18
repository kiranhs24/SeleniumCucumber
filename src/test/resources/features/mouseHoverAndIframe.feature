Feature: Mouse hover and Iframe

	Scenario: Mouse Hover Example
		Given User has opened the site
		When User mouse hovers the element
		Then User should be able to see the options avaliable

	Scenario: Mouse Hover Example to top of page
		Given User has opened the site
		When User mouse hovers the element
		And Clicks on "Top"
		Then User should land on top of the page

	Scenario: Mouse Hover Example to reload the page
		Given User has opened the site
		When User mouse hovers the element
		And Clicks on "Reload"
		Then User should land on top of the page

	Scenario: Switch to Iframe
		Given User has opened the site
		When User switches to an iframe 
		Then User should switch to iframe
	
	Scenario: Mouse hover more inside Iframe 
		Given User has opened the site
		When User switches to an iframe
		And Hovers over the more 
		Then User should be able to see list of options available

	Scenario: Scroll to featured courses
		Given User has opened the site
		When User switches to an iframe
		And Scrolls to featured courses 
		Then User should be able to see list of featured courses available

	Scenario: Navigate to job support page
		Given User has opened the site
		When User switches to an iframe
		And Clicks on job support 
		Then User should land on job support page

	Scenario: Navigate to main page after switching to iframe
		Given User has opened the site
		When User switches to an iframe
		And Switches back to main page
		Then User should be able to use main page contents
