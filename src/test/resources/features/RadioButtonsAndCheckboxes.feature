Feature: Selenium Web Automation
	
	Scenario: Check for first radio button
		Given User has opened the site
		When User clicks on a "first" radio button
		Then "first" radio button should be selected
		When User unchecks the "first" radio button
		Then "first" radio button should be unselected

	Scenario: Check for second radio button
		Given User has opened the site
		When User clicks on a "second" radio button
		Then "second" radio button should be selected
		When User unchecks the "second" radio button
		Then "second" radio button should be unselected

	Scenario: Check for third radio button
		Given User has opened the site
		When User clicks on a "third" radio button
		Then "third" radio button should be selected
		When User unchecks the "third" radio button
		Then "third" radio button should be unselected

	Scenario: Check for first checkbox
		Given User has opened the site
		When User clicks on a "first" checkbox
		Then "first" checkbox should be checked
		When User unchecks the "first" checkbox
		Then "first" checkbox should be unselected

	Scenario: Check for second checkbox
		Given User has opened the site
		When User clicks on a "second" checkbox
		Then "second" checkbox should be checked
		When User unchecks the "second" checkbox
		Then "second" checkbox should be unselected

	Scenario: Check for third checkbox
		Given User has opened the site
		When User clicks on a "third" checkbox
		Then "third" checkbox should be checked
		When User unchecks the "third" checkbox
		Then "third" checkbox should be unselected
