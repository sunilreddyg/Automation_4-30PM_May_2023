Feature: Checking Account login feature

Scenario: Checking Valid Login with Email

	Given site address
	When user enter valid email
	And enter valid password
	And click on login button
	Then verify login successful
	
Scenario: Checking Valid Login with mobile

	
	Given site address
	When user enter valid mobile
	And enter valid password
	And click on login button
	Then verify login successful
	