Feature: Register Account in Para Bank
 
@RegisterAccount
Scenario: Register an user in Para Bank
 
Given User in the ParaBank Register Page
When  User clicks Register link
And   User enters firstname,lastname,address,city,state,zipcode,Phone,ssn
And   User enters Username,password and Confirm-Password
And   User clicks Register button
Then  User able to see logged in page and logout an account
 