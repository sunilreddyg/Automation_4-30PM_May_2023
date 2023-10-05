Feature: Check compatibility
@mobile
Scenario Outline: Steps will run conditionally if tagged
  
  	Given user is logged in
  	When user clicks "<link>"
  	Then user will be logged out

    

  Examples:
    | link                  |
    | logout link on mobile |