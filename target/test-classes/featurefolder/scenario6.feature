
Feature: Login Functionality

 
Background: displays hi
 
Given displays hi message

 
Scenario Outline: Login with multiple inputs-TestMeApp
 
Given user opens testmeapp in the browser
 
Then user enters the username as "<userName>" and password as "<password>"
 
Then user clicks the login button

 
Examples: 
 
|userName||password|

|Mercury||password123|

|Merc||password456|
 
 

