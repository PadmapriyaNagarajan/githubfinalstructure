Feature: Login to Para Bank Application
 
Background:
	Given User in the Para Bank HomePage
	
	@ValidCredentials
	Scenario Outline: Login to Valid Credentials
		When User enters the username "<username>"
  	And USer enters the password "<password>"
	  And User clicks the Log in button
		Then User able to see Accounts Overview
	
	Examples:
		|username|password  |
		|abcd		 |123456789 |
		|efgh		 |987654321 |
		|logesh	 |9952008803|
	
	@InvalidCredentials
	Scenario Outline: Login to Invalid Credentials
		When User enters the username "<username>"
	  And USer enters the password "<password>"
    And User clicks the Log in button
	  Then User able to see Error Message
	
	Examples:
		 |username |password |
		 |fghj		 |123456789|
     |ijk			 |45698755 |
