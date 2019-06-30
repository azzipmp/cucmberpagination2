#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Testing Mercury register functionality
	
Scenario: Testing the Register link
Given Navigate to the flight application
When I click on register link	
Then Register page should display
And Close the browser


Scenario Outline: Testing the user Registration
Given Navigate to the flight application
When I click on register link
And Enter "<username>" ,"<password>" and "<confirmPassword>"
And Click on submit button
Then I verify the "<username>" created sucessfully
And Close the browser

Examples:
   	  | username  |password | confirmPassword |
  		| test123   |  test   | test            |
   	  |test789    |cucumber |cucumber         |