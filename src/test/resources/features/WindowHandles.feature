Feature: Handling different windows

	Scenario: Check for new tab
		Given User has opened the site
		When User clicks on open tab 
		Then A new tab should be opened
	
	Scenario: Check for home page after landing on tab
		Given User has opened the site
		When User clicks on open tab
		And Switches to a new tab
		Then User should land on a new tab
	
	Scenario: Land on main page after closing the tab
		Given User has opened the site
		When User clicks on open tab
		And Switches to a new tab
		Then User should land on a new tab
		When User closes the tab and switches to main page
		Then User should land on parent window

	Scenario: Check for a new window opened
		Given User has opened the site
		When User clicks on open new window
		Then A new window should be opened

	Scenario: Check for a new window opened
		Given User has opened the site
		When User clicks on open new window
		And Switches to new window
		Then User should land on new window
 
	Scenario: Check for a new window opened
		Given User has opened the site
		When User clicks on open new window
		And Switches to new window
		Then User should land on new window
 		When User closes the window and switches to main page
		Then User should land on parent window
