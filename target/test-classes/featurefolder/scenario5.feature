Feature: Login functionality
Background: Displays hello message
Given displaying hello message

@login @regression
Scenario: Login with valid data
Given user login to the flight application

@search @regression
Scenario: Searching for flight
Given user searches for the particular flight

@payment @process
Scenario: Payment processing
Given user pays for the particular flight

@confirm @booking
Scenario: confirmation
Given user confirms and booked the flight