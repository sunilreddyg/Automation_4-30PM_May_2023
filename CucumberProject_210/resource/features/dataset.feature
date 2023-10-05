Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	
	Given User is on Home Page fb
	When User Navigate to LogIn Page1
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully after login
	
Examples:
    | username   | password |
    | testuser_8 | Test@111 |
    | testuser_9 | Test@222 |
    | testuser_1 | Test@333 |