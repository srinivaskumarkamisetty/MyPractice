Feature: Test Nop Commerce Demo
Scenario: Verify Email textbox with invalid format
Given user need to be on NopDemo Homepage
When user enter invalid email format
Then wrong email message must be visible
And close the browser

Scenario: Verify login button functunality as email txt blank
Given user need to be on NopDemo Homepage
When user clear email field
And click on login button
Then please enter your email msg should be visible
And close the browser

Scenario: Verify login button functunality with valid data
Given user need to be on NopDemo Homepage
When user enter valid email "admin@yourstore.com"
And user enter valid password
|admin123|
|abc|
|admin|
And click on login button
Then verify dashboard label
And close the browser



