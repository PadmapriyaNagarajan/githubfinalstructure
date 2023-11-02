Feature: Trying to login the OrangeHRM page
 
Scenario: User trying to login the OrangeHRM file using valid credentials
 
	Given User providing url and launching webpage
	When User providing valid username and valid password
	When User clicking the login button and successfully logging
	Then User get into home page