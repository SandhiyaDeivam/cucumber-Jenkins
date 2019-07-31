Feature: Login functionality

Background: display welcome message

Scenario Outline: login with valid data
When user open chrome browser and opens application
When user enters username as "<username>" and password as "<password>"
And user clicks login
Then verify login result

Examples:
|username|password|
|Lalitha|pass123|
|Mercury|pass456|
