Feature: Alerts and Dropdowns

	Scenario: Check whether the textbox is hidden
		Given User has opened the site 
		When The user clicks on hide button 
		Then The user should not be able to see the textbox
	
	Scenario: Check whether the textbox is visible
	 Given User has opened the site
	 When The user clicks on show button
	 Then The user should be able to see textbox

	 Scenario: Check for alert box
	 	Given User has opened the site
	 	When The user enters the name and clicks on alert
	 	Then User should see an alert with the text message

	 Scenario: Check for confirm alert box
	 	Given User has opened the site
	 	When The user enters the name and clicks on confirm
	 	Then User should see an alert with the text message

	 Scenario: Dismiss alert
	 	Given User has opened the site
	 	When The user enters the name and clicks on confirm
	 	Then User should be able to dismiss the alert

	 Scenario: Check for drop down values
	 	Given User has opened the site
	 	When The user clicks on drop down
	 	Then User should be able to see list of values present in the drop down

	 Scenario: Select drop down value by visible text
	 	Given User has opened the site
	 	When The user clicks on drop down
	 	And Selects one of the drop value by "visible text"
	 	Then User should be able to see the selected option in drop down

	 Scenario: Select drop down value by value attribute
	 	Given User has opened the site
	 	When The user clicks on drop down
	 	And Selects one of the drop value by "value"
	 	Then User should be able to see the selected option in drop down

	Scenario: Check if the drop down is multiselect
		Given User has opened the site
		When The user clicks on drop down 
		Then Drop down should not be multiselect

# DESELECT ONLY WORKS FOR MULTI SELECT DROP DOWN

#	Scenario: Deselect drop down value by visible text
#	 	Given User has opened the site
#	 	When The user clicks on drop down
#	 	And Selects one of the drop value by "visible text"
#	 	And Deselects one of the drop value by "visible text"
#	 	Then Dropdown value should be de-selected
#
#	Scenario: Deselect drop down value by value attribute
#	 	Given User has opened the site
#	 	When The user clicks on drop down
#	 	And Selects one of the drop value by "value"
#	 	And Deselects one of the drop value by "value"
#	 	Then Dropdown value should be de-selected

	Scenario: Auto complete drop down
		Given User has opened the site
		When The user enters value in the text box
		Then Dropdown should contain values which match with the enter keyword

	Scenario: Select valur from auto complete drop down
		Given User has opened the site
		When The user enters value in the text box
		And Selects a value from the list
		Then Dropdown should disappear
